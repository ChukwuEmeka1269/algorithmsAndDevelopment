package explainingInheritance;

public class Car extends Vehicle{
    private int doors;

    public Car( boolean engine, int speedometer, String color, int lights, int doors) {
        super(4, engine, speedometer, color, lights);
        this.doors = doors;
    }
}
