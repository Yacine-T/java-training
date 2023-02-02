public class Main {
    public static void main(String[] args) {
        /*Hamburger myBurger = new Hamburger("Classic", "beef", 8.00, "Bun");
        myBurger.addHamburgerAddition1("Bacon", 1.00);
        myBurger.addHamburgerAddition2("Cheese", 0.50);
        myBurger.addHamburgerAddition3("Pickle", 0.50);
        myBurger.addHamburgerAddition3("Ketchup", 0.00);

        myBurger.itemizeHamburger()*/

        Hamburger myDeluxeBurger = new DeluxeBurger();
        myDeluxeBurger.addHamburgerAddition3("Salami", 2.00);
        myDeluxeBurger.itemizeHamburger();

        /*HealthyBurger myHealthyBurger = new HealthyBurger("Bacon", 5.67);
        myHealthyBurger.addHealthyAddition1("Eggs", 5.43);
        myHealthyBurger.addHealthyAddition2("Cucumber", 3.41);
        myHealthyBurger.itemizeHamburger();*/
    }
}