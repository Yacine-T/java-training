public class ExtraToppings {
    private String type;
    private double price;

    public ExtraToppings(String type){
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (
                   !type.equalsIgnoreCase("cheese")
                && !type.equalsIgnoreCase("bacon")
                && !type.equalsIgnoreCase("onion")
                && !type.equalsIgnoreCase("meat")
                && !type.equalsIgnoreCase("pickle")
           )
            return;
        else{
            this.type = type;
            this.setPrice(this.type);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String type) {
        if (type.equalsIgnoreCase("cheese"))
            this.price = 0.80;
        if (type.equalsIgnoreCase("bacon"))
            this.price = 1.50;
        if (
                type.equalsIgnoreCase("onion")
                || type.equalsIgnoreCase("pickle")
        )
            this.price = 0.50;
        if (type.equalsIgnoreCase("meat"))
            this.price = 2.00;
    }
}
