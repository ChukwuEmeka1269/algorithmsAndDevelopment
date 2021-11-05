package explainingInheritance;

public class Animal {
    //These fields are just a listing of all the general characteristics an animal is suppose to have.
    //These fields can be reasoned as the base fields of every animal.
    //All state and behaviour of a parent class will be inherited by children classes
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called. \nAnimal is eating.....");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. \nAnimal is moving.....");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
