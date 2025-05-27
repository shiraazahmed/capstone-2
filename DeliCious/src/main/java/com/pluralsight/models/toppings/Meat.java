package com.pluralsight.models.toppings;

import java.util.List;

public class Meat extends Topping {

    private int meatSize;


    public Meat(String name, double price, String meatName, int meatSize, double meatPrice) {
        super(name, price);
        this.meatName = meatName;
        this.meatSize = meatSize;
        this.meatPrice = meatPrice;
    }

    @Override
    public String getMeatName() {
        return meatName;
    }

    @Override
    public void setMeatName(String meatName) {
        this.meatName = meatName;
    }

    public int getMeatSize() {
        return meatSize;
    }

    public void setMeatSize(int meatSize) {
        this.meatSize = meatSize;
    }

    @Override
    public double getMeatPrice() {
        return meatPrice;
    }

    @Override
    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }

    public static final List<String> Meats = List.of(
            "Bacon",
            "Chicken",
            "Ham",
            "Steak",
            "Salami",
            "Roast Beef");

    public Meat(String name, double price) {
        super(name, price);
    }


    private static double getPrice(int size) {
        switch (size) {
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                return 0.00;
        }
    }
    private static double getPriceExtraMeat(int size) {
        switch (size) {
            case 4:
                return 0.50;
            case 8:
                return 1.00;
            case 12:
                return 1.50;
            default:
                return 0.00;
        }
    }

    @Override
    public String toString() {
        return "com.pluralsight.models.toppings.Meat{" +
                "meatName='" + getMeatName() + '\'' +
                ", meatPrice=" + getMeatPrice() +
                ", meatSize=" + getMeatSize() +
                '}';
    }
}
