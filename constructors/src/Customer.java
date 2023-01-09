public class Customer {
    private String name;
    private Double creditLimit;
    private String email;

    public Customer() {
        this("Bob", "bob@gmail.com");
        System.out.println("Second constructor called.");
    }

    public Customer(String name, String email) {
        this(name, 200.00d, email);
        System.out.println("Third constructor called.");
    }

    public Customer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("First constructor called.");
    }

    public String getName() {
        return this.name;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
