package fr.java.training;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customersList = new ArrayList<>();

    public void addCustomers(Customer customer) {
        this.customersList.add(customer);
    }

    public void addTransction(Customer customer, double transaction) {
        customer.addTransaction(transaction);
    }

    public void printStatement(Customer customer){
        System.out.println("Account owner : " + customer.getName());
        System.out.println("-".repeat(20));
        ArrayList<Double> transactionsOf = customer.getTransactions();
        transactionsOf.forEach(elt -> System.out.println(elt > 0 ? " ".repeat(3) + "\t".repeat(3) + elt : "\t".repeat(3) + elt));
        System.out.println("-".repeat(20));
        double total = transactionsOf.stream().reduce(0.00, Double::sum);
        System.out.println("Total: \t\t" + total);
    }
}
