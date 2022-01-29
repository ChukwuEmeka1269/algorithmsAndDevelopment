package timbulchalka_object_oriented.polymorphism;

class Mitsubishi extends Cars{
    public Mitsubishi() {
        super(6, "Mitsubishi");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> engine starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerating";
    }

    @Override
    public String _break() {
        return getClass().getSimpleName() + "-> breaking system applied";
    }

}

class Holden extends Cars{
    public Holden() {
        super(6, "Holden");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> engine starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerating";
    }

    @Override
    public String _break() {
        return getClass().getSimpleName() + "-> breaking system applied";
    }

}


class Ford extends Cars{
    public Ford() {
        super(6, "Ford");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> engine starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerating";
    }

    @Override
    public String _break() {
        return getClass().getSimpleName() + "-> breaking system applied";
    }

}

public class Cars {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Cars(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " engine started.";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating";
    }

    public String _break(){
        return getClass().getSimpleName() + " is breaking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
