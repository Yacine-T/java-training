import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        SalariedEmployee yacine = new SalariedEmployee("Yacine", "01/10/1999", 7889L, "20/09/2020", 35000);
        System.out.println(yacine);
        System.out.println("Yacine's paycheck = $" + yacine.collectPay());
        yacine.retire();
        System.out.println("Yacine's pension check = $" + yacine.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", 8886L, "03/03/1970", 15);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday pay = $" + mary.getDoublePay());
    }
}