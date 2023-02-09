package Grocecery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ShoppingList {

    private ArrayList<String> shoppingList;

    public ShoppingList() {
        this.shoppingList = new ArrayList<>();
    }

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void addItem(String items){
        String[] itemsArray = items.split(",");
        for (String elt: itemsArray) {
            elt = elt.trim().toLowerCase();
            if (!this.shoppingList.contains(elt))
                this.shoppingList.add(elt);
        }
    }

    public void removeItem(String items) {
        String[] itemsArray = items.split(",");
        if (!this.shoppingList.isEmpty())
        {
            for (String elt: itemsArray) {
                elt = elt.trim().toLowerCase();
                if (this.shoppingList.contains(elt))
                    this.shoppingList.remove(elt);
            }
        }
    }

    public void printShoppingList(){
        if (!this.shoppingList.isEmpty()) {
            int i = 1;
            for (String item : this.shoppingList) {
                System.out.println("- Item " + i++ + ": " + item);
            }
        }
        else {
            System.out.println("Your list is empty.");
        }
    }

    public void sortList(){
        this.shoppingList.sort(Comparator.naturalOrder());
    }
}
