package com.pluralsight.models.toppings;

import java.util.List;

public class Topping {
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

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Topping() {
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "com.pluralsight.models.toppings.Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
