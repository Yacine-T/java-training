import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Employee yacine = new Employee("Yacine", "01/10/1999", 7889L, "20/09/2020");
        System.out.println(yacine);
        System.out.println("Age = " + yacine.getAge());
        System.out.println("Pay = " + yacine.collectPay());
    }
}