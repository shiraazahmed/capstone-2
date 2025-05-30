package com.pluralsight.ui;

import com.pluralsight.models.Drinks;
import com.pluralsight.models.Receipt;
import com.pluralsight.models.Sandwich;
import com.pluralsight.models.SignatureSandwhiches;
import com.pluralsight.models.toppings.Cheese;
import com.pluralsight.models.toppings.Topping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Order {
    private final Scanner scanner = new Scanner(System.in);
    private String customerName;
    private Sandwich sandwich;
    private boolean toasted;
    private String chipsName;
    private final double chipsPrice = 1.50;
    private boolean auJus;
    private boolean specialSauce;
    private String meat;
    private boolean extraMeat;
    private boolean extraCheese;
    private Drinks drink;

    public void startOrder() {
        System.out.println("Welcome to DeliCious");
        System.out.print("Enter your name to begin: ");
        customerName = scanner.nextLine();

        System.out.println("Choose bread type:");
        for (int i = 0; i < Sandwich.Sandwich.size(); i++) {
            System.out.println((i + 1) + ". " + Sandwich.Sandwich.get(i));
        }
        int breadChoice = scanner.nextInt();
        scanner.nextLine();
        String breadType = Sandwich.Sandwich.get(breadChoice - 1);


        System.out.print("Choose sandwich size (4in., 8in., 12in.): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        sandwich = new Sandwich(customerName + "Sandwich", size, breadType);


        System.out.print("Would you like your sandwich toasted? (yes/no): ");
        toasted = scanner.nextLine().trim().equalsIgnoreCase("yes");


        List<String> meatsList = Arrays.asList("Turkey", "Ham", "Roast Beef", "Chicken", "Salami");
        System.out.println("Choose your meat:");
        for (int i = 0; i < meatsList.size(); i++) {
            System.out.println((i + 1) + ". " + meatsList.get(i));
        }
        int meatChoice = scanner.nextInt();
        scanner.nextLine();
        meat = meatsList.get(meatChoice - 1);

        System.out.print("Would you like extra meat? (yes/no): ");
        extraMeat = scanner.nextLine().trim().equalsIgnoreCase("yes");

        List<Topping> toppings = new ArrayList<>();
        System.out.println("Choose toppings (to choose more than one please use commas to separate):");
        for (int i = 0; i < Topping.ToppingsList.size(); i++) {
            System.out.println((i + 1) + ". " + Topping.ToppingsList.get(i));
        }
        String toppingInput = scanner.nextLine();
        String[] toppingChoices = toppingInput.split(",");
        for (String choice : toppingChoices) {
            try {
                int toppingChoice = Integer.parseInt(choice.trim()) - 1;
                if (toppingChoice >= 0 && toppingChoice < Topping.ToppingsList.size()) {
                    String toppingName = Topping.ToppingsList.get(toppingChoice);
                    toppings.add(new Topping(toppingName, 0.0));
                    System.out.println(toppingName + " added.");
                }
            } catch (NumberFormatException Ignore) {
            }
        }


        System.out.println("Choose cheese (enter number):");
        for (int i = 0; i < Cheese.CheeseList.size(); i++) {
            System.out.println((i + 1) + ". " + Cheese.CheeseList.get(i));
        }
        int cheeseChoice = scanner.nextInt();
        scanner.nextLine();
        String cheeseName = Cheese.CheeseList.get(cheeseChoice - 1);
        toppings.add(new Topping(cheeseName, Cheese.getPrice(size)));

        System.out.print("Would you like extra cheese? (yes/no): ");
        extraCheese = scanner.nextLine().trim().equalsIgnoreCase("yes");


        List<String> saucesList = List.of("Mayo", "Mustard", "Ketchup", "Ranch", "Chipotle", "BBQ");
        List<String> sauces = new ArrayList<>();
        System.out.println("Choose sauces (to choose more than one please use commas to separate):");
        for (int i = 0; i < saucesList.size(); i++) {
            System.out.println((i + 1) + ". " + saucesList.get(i));
        }
        String sauceNumber = scanner.nextLine();
        String[] sauceChoices = sauceNumber.split(",");
        for (String choice : sauceChoices) {
            try {
                int sauceChoice = Integer.parseInt(choice.trim()) - 1;
                if (sauceChoice >= 0 && sauceChoice < saucesList.size()) {
                    String sauceName = saucesList.get(sauceChoice);
                    if (!sauces.contains(sauceName)) {
                        sauces.add(sauceName);
                        System.out.println(sauceName + " added");
                    }
                }
            } catch (NumberFormatException ignored) {
            }
        }


        for (Topping topping : toppings) {
            sandwich.addTopping(topping);
        }
        for (String string : sauces) {
            sandwich.addTopping(new Topping(string, 0.0));
        }

        System.out.print("Would you like a drink? (yes/no): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the drink you want: ");
            String drinkName = scanner.nextLine();
            System.out.print("Choose drink size (small, medium, large): ");
            String drinkSize = scanner.nextLine().trim();
            drink = new Drinks(drinkName, drinkSize);
        }


        System.out.print("Would you like chips? (yes/no): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the chips: ");
            chipsName = scanner.nextLine();
        }


        System.out.print("Would you like to try au jus? (yes/no): ");
        auJus = scanner.nextLine().trim().equalsIgnoreCase("yes");
        System.out.print("Would you like to try special sauce? (yes/no): ");
        specialSauce = scanner.nextLine().trim().equalsIgnoreCase("yes");


        String orderSummary = getOrderSummary(toppings, sauces);
        System.out.println(orderSummary);
        new Receipt().saveReceipt(orderSummary);
        System.out.println("Order saved!");
    }

    private String getOrderSummary(List<Topping> toppings, List<String> sauces) {
        StringBuilder sb = new StringBuilder();
        sb.append(" Order Summary: \n");
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("Bread: ").append(sandwich.getBreadType()).append("\n");
        sb.append("Size: ").append(sandwich.getSize()).append("\n");
        sb.append("Toasted: ").append(toasted ? "Yes" : "No").append("\n");
        sb.append("Meat: ").append(meat);
        if (extraMeat) sb.append(" (Extra)");
        sb.append("\n");

        sb.append("Toppings: ");
        if (toppings.isEmpty()) sb.append("None\n");
        else {
            for (int i = 0; i < toppings.size(); i++) {
                sb.append(toppings.get(i).getName());
                if (i < toppings.size() - 1) sb.append(", ");
            }
            sb.append(extraCheese ? " (Extra Cheese)" : "");
            sb.append("\n");
        }

        sb.append("Sauces: ");
        if (sauces.isEmpty()) sb.append("None\n");
        else {
            for (int i = 0; i < sauces.size(); i++) {
                sb.append(sauces.get(i));
                if (i < sauces.size() - 1) sb.append(", ");
            }
            sb.append("\n");
        }

        if (drink != null)
            sb.append("Drink: ").append(drink.getSize()).append(" ($").append(String.format("%.2f", drink.getPrice())).append(")").append("\n");
        else sb.append("Drink: None\n");

        if (chipsName != null)
            sb.append("Chips: ").append(chipsName).append(" ($").append(String.format("%.2f", chipsPrice)).append(")").append("\n");
        else sb.append("Chips: None\n");

        sb.append("Sides: ");
        List<String> sides = new ArrayList<>();
        if (auJus) sides.add("Au Jus");
        if (specialSauce) sides.add("Special Sauce");


        double total = sandwich.getPrice() + (drink != null ? drink.getPrice() : 0.0) + (chipsName != null ? chipsPrice : 0.0);
        sb.append("Total Price: $").append(String.format("%.2f", total)).append("\n");
        sb.append("Thank you for your order, ").append(customerName).append("!\n");
        return sb.toString();
    }

    public void chooseSignatureSandwich() {
        System.out.println("Welcome to DeliCious");
        System.out.print("Enter your name: ");
        customerName = scanner.nextLine();

        List<Sandwich> signatures = List.of(
                SignatureSandwhiches.spicyDElIcious(),
                SignatureSandwhiches.hotNFire(),
                SignatureSandwhiches.veggiePowerZ(),
                SignatureSandwhiches.classicKidzOriginal(),
                SignatureSandwhiches.bestHotSeller());

        System.out.println("Choose a signature sandwich:");
        for (int i = 0; i < signatures.size(); i++) {
            System.out.println((i + 1) + ". " + signatures.get(i).getName() + " - $" + String.format("%.2f", signatures.get(i).getPrice()));
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice < 1 || choice > signatures.size()) {
            System.out.println("Invalid choice ");
            return;
        }
        System.out.print("Would you like a drink? (yes/no): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the drink you want: ");
            String drinkName = scanner.nextLine();
            System.out.print("Choose drink size (small, medium, large): ");
            String drinkSize = scanner.nextLine().trim();
            drink = new Drinks(drinkName, drinkSize);
        }
        System.out.print("Would you like chips? (yes/no): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the chips: ");
            chipsName = scanner.nextLine();
        }
        sandwich = signatures.get(choice - 1);
        System.out.println(sandwich.getName());
        String OrderSummary = getOrderSummary(new ArrayList<>(sandwich.getToppings()), new ArrayList<>());
        System.out.println(OrderSummary);
        new Receipt().saveReceipt(OrderSummary);
        System.out.println("Your Order will be ready soon!");
    }
}