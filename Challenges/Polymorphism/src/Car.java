public class Car {

    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("The car's engine has started !");
    }

    public void drive(Car c){
        runEngine(c);
        System.out.println("Car is driven by a conductor.");
    }

    protected void runEngine(Car c){
        String carType = c.getClass().getSimpleName();
        System.out.println(c + " car's engine is running ...");
    }

}
