package designPrinciples.company;

public class Dog extends Animal{
    public Dog() {
        super("Dog", 4);
    }


    public void eat(){
        System.out.println("Dog is eating....");
    }

    @Override
    public void makeNoise() {
        System.out.println("woof! woof!");
    }

    @Override
    public Animal getAnimal() {
        return new Dog();
    }

    @Override
    public void feed(Animal animal) {
        if(animal.equals(new Dog())){
            eat();
        }
        System.out.println("can't feed other animal a dog's food.");
    }
}
