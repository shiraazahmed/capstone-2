package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String name;
    private int size;
    private double price;
    private String breadType;
    private List<Toppings> toppings;


    public Sandwich(String name, int size, String breadType) {
        this.name = name;
        this.size = size;
        this.breadType = breadType;
        this.price = calculatePrice(size);
        this.toppings = new ArrayList<>();
    }

    private double calculatePrice(int size) {
        double basePrice = 0.0;
        if (size == 4) {
            basePrice = 5.50;
        } else if (size == 8) {
            basePrice = 7.00;
        } else if (size == 12) {
            basePrice = 8.50;
        }
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        this.price = calculatePrice(size);
    }

    public double getPrice() {
        double totalPrice = price;
        for (Toppings topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "com.pluralsight.models.Sandwich{" +
                "breadType='" + getBreadType() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", size=" + getSize() +
                ", toppings=" + getToppings() +
                '}';
    }
}