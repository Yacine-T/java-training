public class Employee extends Worker {

    private long employeeId = 0;
    private String hireDate;

    public Employee(String name, String birthDate, long employeeId, String hireDate){
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
