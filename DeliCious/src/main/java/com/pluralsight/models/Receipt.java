package com.pluralsight.models;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    public void receiptPrinter(Sandwich sandwich) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("receipts.txt", true))) {
            writer.write(LocalDateTime.now().format(formatter)+ "\n");
            writer.write("Receipt for " + sandwich.getName() + "\n");
            writer.write("Size: " + sandwich.getSize() + "\n");
            writer.write("Price: " + sandwich.getPrice() + "\n");
            writer.write("Topping: " + sandwich.getToppings() + "\n");
            writer.write("Thank you for your order!\n");
        } catch (IOException e) {
            System.out.println("Error! ");
        }

    }

    public void saveReceipt(String orderSummary) {
        try (FileWriter writer = new FileWriter("receipts.txt", true)) {
            writer.write(LocalDateTime.now().format(formatter)+ "\n");
            writer.write(orderSummary);
            writer.write("\n----------------------\n");
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}

