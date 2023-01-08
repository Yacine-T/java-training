public class HourlyEmployee  extends Employee{
    private double hourlyPayRate;
    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate){
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return this.collectPay() * this.hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
