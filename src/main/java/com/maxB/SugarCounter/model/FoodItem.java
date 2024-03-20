package com.maxB.SugarCounter.model;

import org.springframework.stereotype.Component;

public class FoodItem {
    private int sugarContent;

    private String name;

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
