package com.maxB.SugarCounter.controller;


import com.maxB.SugarCounter.dao.JdbcFoodDao;
import com.maxB.SugarCounter.model.FoodItem;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SugarController {

    private JdbcFoodDao foodDao;

    public SugarController() {
        this.foodDao = foodDao;
    }

    @GetMapping(path = "/food/search?{query}")
    public List<FoodItem> searchForSugar(@PathVariable String query) {
        return foodDao.getFood(query);
    }


}
