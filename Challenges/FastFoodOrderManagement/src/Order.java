import java.util.ArrayList;
import java.util.List;

public class Order {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double totalPrice = 0.00;

    public Order(Burger burger, Drink drink, SideItem sideItem){
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.totalPrice = this.burger.getTotalPrice() + this.drink.getPrice() + this.sideItem.getPrice();
    }

    public Order(){
        this(
                new Burger("The classic", 7.50),
                new Drink("Coke", "small"),
                new SideItem("fries")
            );
    }

    @Override
    public String toString() {
        String OrderTicket =  " Your Order : \n -----------------\n"
                + "- Burger: "
                + this.burger.getType()
                + " " + this.burger.getTotalPrice();

        List<ExtraToppings> extraToppings = this.burger.getExtraToppings();
        if (extraToppings.size() > 0)
        {
            OrderTicket += "\n\t- Extra: \n";
            for (ExtraToppings extraTopping: extraToppings) {
                OrderTicket = OrderTicket.concat("\t\t* ");
                OrderTicket = OrderTicket.concat(extraTopping.getType());
                OrderTicket = OrderTicket.concat("\n");
            }
        }

        OrderTicket += "- Drink: ";
        OrderTicket = OrderTicket.concat(this.drink.getType()
                + " "
                + this.drink.getSize()
                + " $"
                + this.drink.getPrice()
                + "\n");

        OrderTicket = OrderTicket.concat("Total : $" + this.totalPrice);

        return OrderTicket;
    }
}
