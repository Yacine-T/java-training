import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExtraToppings bacon = new ExtraToppings("bacon");
        ExtraToppings cheese = new ExtraToppings("cheese");
        ExtraToppings onion = new ExtraToppings("onion");
        ExtraToppings meat = new ExtraToppings("meat");
        ExtraToppings pickle = new ExtraToppings("pickle");

        Burger theItalian = new Burger("the Italian burger", 8.50);
        Burger theVeggie = new Burger("The veggie burger", 8.50);
        Burger theChicken = new Burger("The fry chicken burger", 7.50);
        Burger theClassic = new Burger("The classic burger", 7.50);
        Burger theFish = new Burger("The fry fish burger", 8.00);
        Burger theGoat = new Burger("The goat burger", 9.00);


        String coke = "Coke";
        String orangina = "Orangina";
        String fanta = "Fanta";
        String sprite = "sprite";
        String water = "water";
        String sparklingWater = "sparkling water";




        SideItem potatoes = new SideItem("Potatoes");
        SideItem fries = new SideItem("fries");
        SideItem nuggets = new SideItem("nuggets");

        Burger billsBurger = new Burger(theChicken.getType(), theChicken.getBasePrice());
        billsBurger.addToppings(bacon);
        billsBurger.addToppings(pickle);

        Drink billsDrink = new Drink(orangina, "medium");
        Order billsOrder = new Order(billsBurger, billsDrink, potatoes);

        System.out.println(billsOrder.toString());

    }
}