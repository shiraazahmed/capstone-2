package com.pluralsight.models.toppings;

import java.util.List;

public class Sauces extends Toppings {
    private String sauceName;

    public Sauces(String name, double price, String sauceName) {
        super(name, price);
        this.sauceName = sauceName;
    }

    public Sauces(String sauceName) {
        this.sauceName = sauceName;
    }

    public String getSauceName() {
        return sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }
    public static final List<String> Sauces = List.of(
            "Mayo",
            "Mustard",
            "Ketchup",
            "Ranch",
            "Thousand Islands",
            "Vinaigrette");

    @Override
    public String toString() {
        return "com.pluralsight.models.toppings.Sauces{" +
                "sauceName='" + getSauceName() + '\'' +
                '}';
    }
}
