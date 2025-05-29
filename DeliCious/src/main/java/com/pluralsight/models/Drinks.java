package com.pluralsight.models;

public class Drinks {
    private static double price;
    private String size;

    public Drinks(String price, String size) {
        this.size = size;
        this.price = calculatePrice(size);
    }
    private double calculatePrice(String size) {
        switch (size) {
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default:
                return 0.0;

        }
    }

    public static double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "com.pluralsight.models.Drinks{" +
                "size='" + getSize() + '\'' +
                '}';
    }
}
