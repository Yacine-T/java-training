import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String type;
    private final double basePrice;

    private double totalPrice;
    private final int maxToppings;

    protected List<ExtraToppings> extraToppings;

    public Burger(String type, double price){
            this.type = type;
            this.basePrice = price;
            this.totalPrice = this.basePrice;
            this.maxToppings = 3;
            this.extraToppings = new ArrayList<>();
    }

    public void addToppings(ExtraToppings t){
        if (extraToppings.size() < maxToppings)
        {
            extraToppings.add(t);
            this.totalPrice += t.getPrice();
        }
        else{
            System.out.println("""
                    Too much toppings. Remove some of those which 
                    are in your current order to include this one in your 
                    current formula.
                    """);
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getMaxToppings() {
        return maxToppings;
    }

    public List<ExtraToppings> getExtraToppings() {
        return extraToppings;
    }
}
