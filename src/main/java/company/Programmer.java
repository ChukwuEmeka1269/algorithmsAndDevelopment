package company;

public class Programmer implements Employee{
    private String name;

    public Programmer() {
        this.name = "Programmer";
    }

    @Override
    public void doWork() {
        System.out.println("Programmer is programming >>>>>>>");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
