public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, boolean isRetired) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = this.collectPay() * 12;
        this.isRetired = isRetired;
    }

    public void retire(){
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }
}
