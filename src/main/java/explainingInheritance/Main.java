package explainingInheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1, 1, 1, 140);
//        Dog dog = new Dog("Billie", 50,250,1,2,4,20,"Long silky");
//        Fish fish = new Fish("fishie", 1, 500, 4, 1, 2, false);
//        fish.move(2);
//        fish.eat();

        Vehicle vehicle = new Vehicle(4, true, 56, "blue", 2);
//        vehicle.moving();
        vehicle.changeGear();
    }
}
