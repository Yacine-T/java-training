import java.util.List;

public class Store {
    public static void main(String[] args) {
        Desk officeDesk = new Desk("Office desk", 30.00, "This is an office desk made by the furniture store Ikea.");
        Computer dellComputer = new Computer("Dell XPS 15", 1300.00, "This the brand-new XPS 13 dell computer.");
        Chair officeChair = new Chair("Office chair", 15.00, "This is an old office chair made by conforama.");

        List<ProductForSale> productForSaleList = List.of(officeDesk, dellComputer, officeChair);

        System.out.println("For sales items:");
        for (ProductForSale pfs: productForSaleList) {
            pfs.showDetails();
        }

        List<OrderItem> orderItemList = List.of(
                new OrderItem(2, dellComputer),
                new OrderItem(1, officeChair),
                new OrderItem(1, officeDesk)
        );


        System.out.printf("%s %20s %10s%n", "Type", "Quantity", "Price");
        System.out.println("-".repeat(40));
        double totalPrice = 0.00;
        for (OrderItem orderItem : orderItemList){
            orderItem.getPfs().printPricedLineItem(orderItem.getQuantity());
            totalPrice += orderItem.getPfs().getSalesPrice(orderItem.getQuantity());
        }
        System.out.println("-".repeat(40));
        System.out.printf("Total: %31s", "$" + String.format("%.2f", totalPrice));
    }
}