public class SideItem {

    private String type;
    private double price;

    public SideItem(String type){
        this.type = type;
        this.setPrice(this.type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        this.setPrice(this.type);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String type) {
        if (type.equalsIgnoreCase("fries"))
            this.price = 1.00;
        if (type.equalsIgnoreCase("potatoes"))
            this.price = 1.50;
        if (type.equalsIgnoreCase("nuggets"))
            this.price = 1.75;
    }
}
