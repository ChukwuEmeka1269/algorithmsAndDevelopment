package timbulchalka_object_oriented.encapsulation;

public class Printer {
    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(double tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel >-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.isDuplexPrinter = isDuplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public double fillUpToner(){
        if(this.tonerLevel == 100){
            System.out.println("Toner Level is full");
            return getTonerLevel();
        }
        else{
            double usedUpToner = 100 - tonerLevel;
            System.out.println("Adding " + usedUpToner + "% of toner to printer.");
            System.out.println("Toner Level is now at 100%");
            return usedUpToner + tonerLevel;
        }
    }

    public void print(int numberOfPagesToBePrinted){
        for(int i=0; i< numberOfPagesToBePrinted; i += 2 ) {
            if (isDuplexPrinter) {
                System.out.println("Duplex Printer -> Printing on both sides of paper | ");
            } else {
                System.out.println("Normal Printer -> Printing.... page "+ i);
            }
            this.numberOfPagesPrinted++;
        }

    }


    private double getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    private boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
