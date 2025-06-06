package com.pluralsight.ui;

import com.pluralsight.models.toppings.Cheese;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to DeliCious!");
            System.out.println("1. Start Your Order");
            System.out.println("2. View Our Famous Signature Sandwiches");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    new Order().startOrder();
                    break;
                case 2:
                    new Order().chooseSignatureSandwich();
                    break;
                case 3:
                    running = false;
                    System.out.println("Thank you for visiting DeliCious!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println();
        }
    }
}
