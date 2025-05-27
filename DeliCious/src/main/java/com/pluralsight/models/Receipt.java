package com.pluralsight.models;

import java.io.*;

public class Receipt {
    public void receiptReader(Sandwich sandwich) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("receipts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error! ");
        }
    }
    public void receiptPrinter(Sandwich sandwich) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("receipts.txt", true))) {
            writer.write("Receipt for " + sandwich.getName() + "\n");
            writer.write("Size: " + sandwich.getSize() + "\n");
            writer.write("Price: " + sandwich.getPrice() + "\n");
            writer.write("Topping: " + sandwich.getToppings() + "\n");
            writer.write("Thank you for your order!\n");
        } catch (IOException e) {
            System.out.println("Error! ");
        }

    }

}

