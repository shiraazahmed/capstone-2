package com.pluralsight.ui;

import com.pluralsight.models.toppings.Cheese;

public class Program {
    public static void main(String[] args) {
        Cheese cheese = new Cheese("Cheddar", 0.50);
        System.out.println("Topping: " + cheese.getName());
    }
}
