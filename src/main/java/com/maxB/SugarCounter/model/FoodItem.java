package com.maxB.SugarCounter.model;

import org.springframework.stereotype.Component;

public class FoodItem {
    private int sugarContent;

    private String name;

    private int id;

    public FoodItem() {

    }
    public FoodItem(int id, int sugarContent, String name) {
        this.id = id;
        this.sugarContent = sugarContent;
        this.name = name;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
