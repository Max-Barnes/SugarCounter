package com.maxB.SugarCounter.dao;

import com.maxB.SugarCounter.model.FoodItem;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcFoodDao {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public JdbcFoodDao(DataSource datasource) {
        jdbcTemplate = new JdbcTemplate(datasource);
    }


    /**
       Returns all food items that are similar to given string. Will show results and
     allow user to choose what to add to their eaten foods. Can add more data in the future.
     @param searchQuery searches the database
     */
    public List<FoodItem> getFoodByName(String searchQuery) {
        List<FoodItem> foods = new ArrayList<>();
        String sql = "select id, restaurant, item, sugar from food_data where item ilike ? or restaurant ilike ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, '%' + searchQuery + '%', '%' + searchQuery + '%');

            while (results.next()) {
                foods.add(mapRowToFoodItem(results));
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new RuntimeException("Cannot access jdbc database" + e);
        }

        return foods;
    }

    /**
     * returns entire list of food database with sugar and name.
     * @return
     */
    public List<FoodItem> getAllFoodItems() {
        List<FoodItem> foods = new ArrayList<>();
        String sql = "select item, sugar from food_data;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

            while (results.next()) {
                foods.add(mapRowToFoodItem(results));
            }

        } catch (CannotGetJdbcConnectionException e) {
            throw new RuntimeException("Cannot access jdbc database");
            }
        return foods;
    }

    /**
     *  helper method to map a rowset from a query to the food model.
     *  Does not take food id because I dont think its needed
     *
     */

    private FoodItem mapRowToFoodItem(SqlRowSet results) {
        FoodItem food = new FoodItem();
        food.setId(results.getInt("id"));
        food.setName(results.getString("restaurant")+ ' ' + results.getString("item"));
        food.setSugarContent(results.getInt("sugar"));

        return food;
    }

}
