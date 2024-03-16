package com.maxB.SugarCounter.dao;

import com.maxB.SugarCounter.model.FoodItem;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface FoodDao {

    List<FoodItem> getFood(String search);

}
