package com.maxB.SugarCounter.model;

import org.springframework.stereotype.Component;

public class FoodItem {
    private int sugarContent;

    private String name;

    private int id;
    private int cal;

    private int calFat;

    private int totalFat;

    private double satFat;

    private double transFat;

    private int cholesterol;

    private int sodium;

    private int totalCarb;

    private int fiber;

    private int sugar;

    private int protein;

    private int vitA;

    private int vitC;

    private int calcium;


    public FoodItem() {

    }

    public FoodItem(int sugarContent, String name, int id, int cal, int calFat, int totalFat, double satFat, double transFat, int cholesterol, int sodium, int totalCarb, int fiber, int sugar, int protein, int vitA, int vitC, int calcium) {
        this.sugarContent = sugarContent;
        this.name = name;
        this.id = id;
        this.cal = cal;
        this.calFat = calFat;
        this.totalFat = totalFat;
        this.satFat = satFat;
        this.transFat = transFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.totalCarb = totalCarb;
        this.fiber = fiber;
        this.sugar = sugar;
        this.protein = protein;
        this.vitA = vitA;
        this.vitC = vitC;
        this.calcium = calcium;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getCalFat() {
        return calFat;
    }

    public void setCalFat(int calFat) {
        this.calFat = calFat;
    }

    public int getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(int totalFat) {
        this.totalFat = totalFat;
    }

    public double getSatFat() {
        return satFat;
    }

    public void setSatFat(double satFat) {
        this.satFat = satFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getTotalCarb() {
        return totalCarb;
    }

    public void setTotalCarb(int totalCarb) {
        this.totalCarb = totalCarb;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getVitA() {
        return vitA;
    }

    public void setVitA(int vitA) {
        this.vitA = vitA;
    }

    public int getVitC() {
        return vitC;
    }

    public void setVitC(int vitC) {
        this.vitC = vitC;
    }

    public int getCalcium() {
        return calcium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
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
