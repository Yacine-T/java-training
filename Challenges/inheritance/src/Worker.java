import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() throws ParseException {
        LocalDate workerBirthDate = LocalDate.parse(this.birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate currentDate = LocalDate.now();
        return Period.between(workerBirthDate, currentDate).getYears();
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
