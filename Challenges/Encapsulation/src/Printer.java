public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel <= 0 || tonerLevel >= 100) this.tonerLevel = -1;
        else this.tonerLevel = tonerLevel;

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount + this.tonerLevel < 0 || this.tonerLevel + tonerAmount  > 100) {
            System.out.println("The quantity entered isn't valid. " +
                    "Please provide a value that, once added to the current toner level,  " +
                    "fit the range of 0 percent to 100.");
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){
        if (duplex){
            System.out.println("It's a duplex printer");
            this.pagesPrinted += (pages/2) + (pages%2);
            return (pages/2) + (pages%2);
        } else {
            this.pagesPrinted += pages;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
