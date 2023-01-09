import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        terminate(LocalDateTime.now().toString());
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        double payCheck = this.annualSalary/26;
        double adjustedPay = isRetired ? 0.9 * payCheck : payCheck;

        return (int) adjustedPay;
    }
}
