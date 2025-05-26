package com.pluralsight.models.toppings;

import java.util.List;

public class Cheese extends Toppings {
    private String cheeseName;
    private double cheesePrice;

    public Cheese(String name, double price, String cheeseName, double cheesePrice) {
        super(name, price);
        this.cheeseName = cheeseName;
        this.cheesePrice = cheesePrice;
    }

    public String getCheeseName() {
        return cheeseName;
    }

    public void setCheeseName(String cheeseName) {
        this.cheeseName = cheeseName;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public void setCheesePrice(double cheesePrice) {
        this.cheesePrice = cheesePrice;
    }
    public static final List<String> CheeseList = List.of(
            "Cheddar",
            "Swiss",
            "Provolone",
            "Pepper Jack",
            "Mozzarella",
            "American");


    private static double getPrice(int size) {
        switch (size) {
            case 4:
                return .75;
            case 8:
                return 1.50;
            case 12:
                return 2.25;
            default:
                return 0.0;
        }
    }
    public static double getExtraCheesePrice(int size) {
        switch (size) {
            case 4:
                return .30;
            case 8:
                return .60;
            case 12:
                return .90;
            default:
                return 0.0;
        }
    }

    @Override
    public String toString() {
        return "com.pluralsight.models.toppings.Cheese{" +
                "cheeseName='" + getCheeseName() + '\'' +
                ", cheesePrice=" + getCheesePrice() +
                '}';
    }
}
