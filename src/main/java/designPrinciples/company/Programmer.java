package designPrinciples.company;

public class Programmer implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programmer is writing codes >>>>>");
    }
}
