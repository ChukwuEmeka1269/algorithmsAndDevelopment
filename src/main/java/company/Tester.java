package company;

public class Tester implements Employee{
    private String name;

    public Tester() {
        this.name = "Tester";
    }

    @Override
    public void doWork() {
        System.out.println("Software Tester is testing the application.");
    }

    public String getName() {
        return this.name;
    }
}
