package com.pluralsight.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Receipt {
    public void printReceipt(Sandwich sandwich) {
        StringBuilder sb = new StringBuilder();
        sb.append("Receipt Order...\n");
        sb.append("Sandwich Name: ").append(sandwich.getName()).append("\n");
        sb.append("Size: ").append(sandwich.getSize()).append(" inches\n");
        sb.append("Bread Type: ").append(sandwich.getBreadType()).append("\n");
        sb.append("Toppings:\n");
        for (Toppings topping : sandwich.getToppings()) {
            sb.append(" - ").append(topping.getName()).append(": $").append(topping.getPrice()).append("\n");
            sb.append("Total Price: $").append(String.format("%.2f", sandwich.getPrice())).append("\n");
        }
        sb.append("Thank you for your order!\n");

        System.out.println(sb);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("receipts.txt", true))) {
            writer.write(sb.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

