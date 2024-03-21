package com.maxB.SugarCounter.model;

import org.springframework.stereotype.Component;

public class FoodItem {
    private int sugarContent;

    private String name;

    public FoodItem() {

    }
    public FoodItem(int sugarContent, String name) {
        this.sugarContent = sugarContent;
        this.name = name;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
