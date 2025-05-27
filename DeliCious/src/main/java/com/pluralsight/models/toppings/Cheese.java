package com.pluralsight.models.toppings;

import java.util.List;

public class Cheese extends Topping {

    public static final List<String> CheeseList = List.of(
            "Cheddar",
            "Swiss",
            "Provolone",
            "Pepper Jack",
            "Mozzarella",
            "American");

    public Cheese(String cheddar, double v) {
        super(cheddar, v);
    }


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


}
