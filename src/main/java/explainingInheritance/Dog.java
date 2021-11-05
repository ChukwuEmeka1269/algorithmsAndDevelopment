package explainingInheritance;

public class Dog extends Animal{
    private int tails;
    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int tails, int eyes, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.tails = tails;
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing...");
    }

    private void walk(){
        System.out.println("Dog is walking....");
    }

    private void run(){
        System.out.println("Dog is running....");
    }

    @Override
    public void eat() {
        if(this.getClass().equals(Dog.class))
            chew();
        else{
            super.eat();
        }

    }

    @Override
    public void move(int speed) {
        if(speed > 0 && speed <= 5)
            walk();
        else if(speed > 5 && speed <= 90 )
            run();
        else{
            super.move(speed);
        }

    }
}
