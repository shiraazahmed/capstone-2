package com.pluralsight.models;

import com.pluralsight.models.toppings.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String name;
    private int size;
    private double price;
    private String breadType;
    private List<Topping> toppings;
    private boolean toasted;


    public Sandwich(String name, int size, String breadType) {
        this.name = name;
        this.size = size;
        this.breadType = breadType;
        this.price = calculatePrice(size);
        this.toppings = new ArrayList<>();
        this.toasted = false;
    }

    private double calculatePrice(int size) {
        double basePrice = 0.0;
        if (size == 4) {
            basePrice = 5.50;
        } else if (size == 8) {
            basePrice = 7.00;
        } else if (size == 12) {
            basePrice = 8.50;
        }
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public double getPrice() {
        double totalPrice = price;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    public static final List<String> Sandwich = List.of(
            "White",
            "Wheat",
            "Wrap",
            "Rye");

    public static final List<String> Sauces = List.of(
            "Mayo",
            "Mustard",
            "Ketchup",
            "Ranch",
            "Thousand Islands",
            "Vinaigrette");

    public static final List<String> Sides = List.of(
            "Au Jus",
            "Special Sauce");


    @Override
    public String toString() {
        return "com.pluralsight.models.Sandwich{" +
                "breadType='" + getBreadType() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", size=" + getSize() +
                ", toasted=" + isToasted() +
                ", toppings=" + getToppings() +
                '}';
    }
}




