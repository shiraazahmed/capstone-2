package com.pluralsight.models;

import com.pluralsight.models.toppings.Topping;

public class SignatureSandwhiches extends Sandwich{

    public SignatureSandwhiches(String name, int size, String breadType) {
        super(name, size, breadType);
    }
    public static Sandwich spicyDElIcious() {
        SignatureSandwhiches sandwhiches = new SignatureSandwhiches("Spicy Delicious", 8, "Wheat");
        sandwhiches.addTopping(new Topping("Chicken", 0.00));
        sandwhiches.addTopping(new Topping("Cheddar", 0.00));
        sandwhiches.addTopping(new Topping("Lettuce", 0.00));
        sandwhiches.addTopping(new Topping("Tomatoes", 0.00));
        sandwhiches.addTopping(new Topping("Jalapeños", 0.00));
        sandwhiches.addTopping(new Topping("Ranch", 0.00));
        sandwhiches.addTopping(new Topping("Special Sauce", 0.00));
        sandwhiches.setToasted(true);
        return sandwhiches;
    }
    public static Sandwich hotNFire() {
        SignatureSandwhiches sandwhiches = new SignatureSandwhiches("Hot N Fire", 12, "Wheat");
        sandwhiches.addTopping(new Topping("Roast Beef", 0.00));
        sandwhiches.addTopping(new Topping("Pepper Jack Cheese", 0.00));
        sandwhiches.addTopping(new Topping("Lettuce", 0.00));
        sandwhiches.addTopping(new Topping("Tomatoes", 0.00));
        sandwhiches.addTopping(new Topping("Jalapeños", 0.00));
        sandwhiches.addTopping(new Topping("Vinaigrette", 0.00));
        sandwhiches.addTopping(new Topping("Special Sauce", 0.00));
        sandwhiches.setToasted(true);
        return sandwhiches;
    }
    public static Sandwich veggiePowerZ() {
        SignatureSandwhiches sandwhiches = new SignatureSandwhiches("Veggie Power Z", 12, "Wrap");
        sandwhiches.addTopping(new Topping("Guacamole", 0.00));
        sandwhiches.addTopping(new Topping("Swiss", 0.00));
        sandwhiches.addTopping(new Topping("Lettuce", 0.00));
        sandwhiches.addTopping(new Topping("Tomatoes", 0.00));
        sandwhiches.addTopping(new Topping("Cucumbers", 0.00));
        sandwhiches.addTopping(new Topping("Special Sauce", 0.00));
        sandwhiches.setToasted(false);
        return sandwhiches;
    }
    public static Sandwich classicKidzOriginal() {
        SignatureSandwhiches sandwhiches = new SignatureSandwhiches("Classic Kidz OG", 4, "Rye");
        sandwhiches.addTopping(new Topping("Chicken", 0.00));
        sandwhiches.addTopping(new Topping("Cheddar", 0.00));
        sandwhiches.addTopping(new Topping("Lettuce", 0.00));
        sandwhiches.addTopping(new Topping("Tomatoes", 0.00));
        sandwhiches.addTopping(new Topping("Pickles", 0.00));
        sandwhiches.addTopping(new Topping("Mayo", 0.00));
        sandwhiches.addTopping(new Topping("Special Sauce", 0.00));
        sandwhiches.setToasted(true);
        return sandwhiches;
    }
    public static Sandwich bestHotSeller() {
        SignatureSandwhiches sandwhiches = new SignatureSandwhiches("Best Seller", 8, "Wheat");
        sandwhiches.addTopping(new Topping("Roast Beef", 0.00));
        sandwhiches.addTopping(new Topping("Provolone Cheese", 0.00));
        sandwhiches.addTopping(new Topping("Lettuce", 0.00));
        sandwhiches.addTopping(new Topping("Tomatoes", 0.00));
        sandwhiches.addTopping(new Topping("Onions", 0.00));
        sandwhiches.addTopping(new Topping("Mustard", 0.00));
        sandwhiches.addTopping(new Topping("Special Sauce", 0.00));
        sandwhiches.setToasted(true);
        return sandwhiches;
    }
}
