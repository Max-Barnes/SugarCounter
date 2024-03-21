package com.maxB.SugarCounter.controller;


import com.maxB.SugarCounter.dao.FoodDao;
import com.maxB.SugarCounter.dao.JdbcFoodDao;
import com.maxB.SugarCounter.model.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SugarController {

    private JdbcFoodDao foodDao;

    public SugarController(JdbcFoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @RequestMapping(path = "/food/search", method = RequestMethod.GET)
    public List<FoodItem> searchForSugar(@RequestParam String name) {
        return foodDao.getFoodByName(name);
    }

    @RequestMapping(path = "/food", method = RequestMethod.GET)
    public List<FoodItem> getAllFoods() {
        return foodDao.getAllFoodItems();
    }

}
