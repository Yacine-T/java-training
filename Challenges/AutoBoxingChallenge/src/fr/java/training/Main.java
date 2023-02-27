package fr.java.training;

public class  Main {
    public static void main(String[] args) {
     Bank revolut = new Bank();
     Customer john = new Customer("John");

     Customer david = new Customer("David");
     Customer ibrahim = new Customer("Ibrahim");
     Customer monica = new Customer("Monica");
     Customer katelyn = new Customer("Katelyn");

     revolut.addCustomers(john);
     revolut.addCustomers(david);
     revolut.addCustomers(ibrahim);
     revolut.addCustomers(monica);
     revolut.addCustomers(katelyn);

     revolut.addTransction(john, 1500.00);
     revolut.addTransction(john,-200.00);
     revolut.addTransction(john,-30.00);
     revolut.addTransction(john,150.00);

     revolut.printStatement(john);


    }
}