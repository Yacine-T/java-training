public abstract class ProductForSale {
    protected String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return this.price * quantity;
    }

    public void printPricedLineItem(int quantity) {
        System.out.printf("%s %3s x%d %5s $%.2f%n", this.type, "", quantity, "", this.getSalesPrice(quantity));
    }

    public abstract void showDetails();

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
