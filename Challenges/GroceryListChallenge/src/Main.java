import Grocecery.ShoppingList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner operation = new Scanner(System.in);
        Scanner items = new Scanner(System.in);
        ShoppingList sh = new ShoppingList();
        boolean isOperationOk = false;
        while (!isOperationOk) {
            Main.printAvailableOperations();
            char op = operation.next().charAt(0);

            switch (Character.getNumericValue(op)) {
                case 0 -> {
                    isOperationOk = true;
                }
                case 1 -> {
                    System.out.println("Enter the item(s) you want to add, please.");
                    sh.addItem(items.nextLine());
                }
                case 2 -> {
                    System.out.println("Enter the item(s) you want to remove, please.");
                    sh.removeItem(items.nextLine());
                }
                default -> {
                    System.out.println("Sorry, I haven't understand which operation you want to do.");
                }
            }
            sh.sortList();
            sh.printShoppingList();
        }
        System.out.println("You're exiting the app. Good bye !");
        System.exit(0);
    }

    private static void printAvailableOperations() {
        System.out.println("""
                Available actions:
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""" + " ");
    }
}