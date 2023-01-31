public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size){
        this.type = type;
        this.size = size;
        this.setPrice(this.size);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        this.setPrice(this.size);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String size) {
        if (size.equalsIgnoreCase("medium"))
            this.price = 1.50;
        else if (size.equalsIgnoreCase("big"))
            this.price = 2.00;
        else
            this.price = 1.00;
    }
}
