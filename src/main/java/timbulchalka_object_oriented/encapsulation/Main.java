package timbulchalka_object_oriented.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Printer printer = new Printer(50,  false);
//        printer.fillUpToner();
//        printer.print(7);
//        System.out.println(printer.getNumberOfPagesPrinted());

        Printer2 printer2 = new Printer2(50, true);
        System.out.println(printer2.addToner(50));
        System.out.println("initial page count = "+ printer2.getPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for printer = " + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for printer = " + printer2.getPagesPrinted());


    }
}
