public class Chair extends ProductForSale {

    public Chair(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.printf("Type: %s%nPrice: $%.2f%nDescription: %s%n%n", type, this.getPrice(), this.getDescription());
    }

}