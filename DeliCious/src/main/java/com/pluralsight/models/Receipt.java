package com.pluralsight.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Receipt {
    public void printReceipt(Sandwich sandwich) {
        StringBuilder sb = new StringBuilder();
        sb.append("Receipt Order...\n");
        sb.append("Sandwich Name: " + sandwich.getName() + "\n");
        sb.append("Size: " + sandwich.getSize()+ "\n");
        sb.append("Bread Type: " + sandwich.getBreadType() + "\n");
        sb.append("Toppings:\n");
        for (Toppings topping : sandwich.getToppings()) {
            sb.append(" - " + topping.getName() + ": $ " + topping.getPrice() + "\n");
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

