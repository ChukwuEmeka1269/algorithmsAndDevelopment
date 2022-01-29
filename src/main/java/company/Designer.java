package company;

public class Designer implements Employee{
    private String name;

    public Designer() {
        this.name = "Designer";
    }

    @Override
    public void doWork() {
        System.out.println("Designer is designing>>>><<<<");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
