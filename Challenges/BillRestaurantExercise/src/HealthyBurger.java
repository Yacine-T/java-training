public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
        if (this.healthyExtra1Name != null)
            System.out.printf("Added %s for an extra %4.2f%n", this.healthyExtra1Name, this.healthyExtra1Price);
        if (this.healthyExtra2Name != null)
            System.out.printf("Added %s for an extra %4.2f%n", this.healthyExtra2Name, this.healthyExtra2Price);
        if (this.getClass().getSimpleName() == "HealthyBurger")
            System.out.printf("Total Burger price is %4.2f%n", totalPrice);
        return totalPrice;
    }
}
