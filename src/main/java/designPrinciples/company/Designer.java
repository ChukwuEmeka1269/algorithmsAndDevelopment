package designPrinciples.company;

public class Designer implements Employee{
    @Override
    public void doWork() {
        System.out.println("Designer is building the architecture display >>>>>");
        System.out.println("Designer is done working");
    }
}
