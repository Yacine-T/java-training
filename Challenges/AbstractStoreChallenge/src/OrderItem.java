public class OrderItem {

    private int quantity;
    private ProductForSale pfs;

    public OrderItem(int quantity, ProductForSale pfs) {
        this.quantity = quantity;
        this.pfs = pfs;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductForSale getPfs() {
        return pfs;
    }
}
