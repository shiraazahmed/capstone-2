package com.pluralsight.models.toppings;

import java.util.List;

public class Sides extends Toppings {
    private String sideName;

    public Sides(String name, double price, String sideName) {
        super(name, price);
        this.sideName = sideName;
    }

    public Sides(String sideName) {
        this.sideName = sideName;
    }

    public String getSideName() {
        return sideName;
    }

    public void setSideName(String sideName) {
        this.sideName = sideName;
    }
    public static final List<String> Sides = List.of(
            "Au Jus",
            "Special Sauce");

    @Override
    public String toString() {
        return "com.pluralsight.models.toppings.Sides{" +
                "sideName='" + getSideName() + '\'' +
                '}';
    }
}
