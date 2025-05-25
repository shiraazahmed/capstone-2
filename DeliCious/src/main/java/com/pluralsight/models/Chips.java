package com.pluralsight.models;

public class Chips {
    private String name;
    private final double price = 1.50;

    public Chips(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "com.pluralsight.models.Chips{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
