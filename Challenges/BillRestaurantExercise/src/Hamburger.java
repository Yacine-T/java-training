public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String  breadRollType;

    private String addition1Name = null;
    private double addition1Price = 0.00;
    private String addition2Name = null;
    private double addition2Price = 0.00;
    private String addition3Name = null;
    private double addition3Price = 0.00;
    private String addition4Name = null;
    private double addition4Price = 0.00;

    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        if (this.getClass().getSimpleName() == "Hamburger")
        {
            System.out.printf("%s hamburger on a %s roll with %s, price is %4.2f%n", this.name, this.meat, this.breadRollType, this.price);
            if (this.addition1Name != null)
                System.out.printf("Added %s for an extra %4.2f%n", this.addition1Name, this.addition1Price);
            if (this.addition2Name != null)
                System.out.printf("Added %s for an extra %4.2f%n", this.addition2Name, this.addition2Price);
            if (this.addition3Name != null)
                System.out.printf("Added %s for an extra %4.2f%n", this.addition3Name, this.addition3Price);
            if (this.addition4Name != null)
                System.out.printf("Added %s for an extra %4.2f%n", this.addition4Name, this.addition4Price);
        }
        else
        {
            System.out.printf("Healthy hamburger on a Brown rye roll with %s, price is %4.2f%n", this.meat, this.price);
        }

        double totalPrice = this.price;

        if (this.getClass().getSimpleName() == "Hamburger")
        {
            totalPrice += this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;;
            System.out.printf("Total Burger price is %4.2f%n", totalPrice);
        }

        return totalPrice;
    }
}