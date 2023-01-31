import java.util.List;

public class DeluxeBurger extends Burger {

    private final int maxToppings = 5;

    public DeluxeBurger(){
        super("Deluxe burger", 10.00);
    }

    @Override
    public void addToppings(ExtraToppings t){
        if (extraToppings.size() < maxToppings)
        {
            extraToppings.add(t);
        }
        else{
            System.out.println("""
                    Too much toppings. Remove some of those which 
                    are in your current order to include this one in your 
                    current formula.
                    """);
        }
    }
}
