package explainingInheritance;

public class Fish extends Animal{
    private int fins;
    private int tail;
    private int gills;
    private boolean hasScale;

    public Fish(String name, int size, int weight, int fins, int tail, int gills, boolean hasScale) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.tail = tail;
        this.gills = gills;
        this.hasScale = hasScale;
    }

    private void swallow(){
        System.out.println("Fish is swallowing food...");
    }

    private void muscleMovement(){
        System.out.println("Fish muscle moving");
    }

    private void adjustFin(){
        System.out.println("Fish is adjusting its fin.");
    }

    @Override
    public void eat() {
        if(this.getClass().equals(Fish.class))
            swallow();
        else{
            super.eat();
        }
    }

    @Override
    public void move(int speed) {
        if(speed > 0) {
            muscleMovement();
            adjustFin();
            System.out.println("Fish is now swimming.....");
        }
        else{
            super.move(speed);
        }

    }

    public int getFins() {
        return fins;
    }

    public int getTail() {
        return tail;
    }

    public int getGills() {
        return gills;
    }

    public boolean isHasScale() {
        return hasScale;
    }
}
