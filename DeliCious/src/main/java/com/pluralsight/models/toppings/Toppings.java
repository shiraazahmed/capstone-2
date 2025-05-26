package com.pluralsight.models.toppings;

import java.util.List;

public class Toppings  {
    private String name;
    private double price;

    public static final List<String> ToppingsList = List.of(
            "Lettuce",
            "Peppers",
            "Onions",
            "Tomatoes",
            "Jalapeños",
            "Cucumbers",
            "Pickles",
            "Guacamole",
            "Mushrooms");

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getMeatName() {
        return name;
    }

    public void setMeatName(String meatName) {
        this.name = meatName;
    }

    public double getMeatPrice() {
        return price;
    }

    public void setMeatPrice(double meatPrice) {
        this.price = meatPrice;
    }

    @Override
    public String toString() {
        return "name='" + getMeatName() + '\'' +
                ", price=" + getMeatPrice() +
                '}';
    }
}
