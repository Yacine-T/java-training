public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinder;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }



    @Override
    public void drive(Car c){
        super.drive(c);
        System.out.println("It 's a gas power car which is driven.");
    }

}
