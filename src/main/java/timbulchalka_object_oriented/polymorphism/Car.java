package timbulchalka_object_oriented.polymorphism;

class Benz extends Car{

    public Benz() {
        super(Brands.BENZ.toString(), 8);
    }

    @Override
    public String startEngine() {
        return Brands.BENZ.name() + " Engine is on";
    }

    @Override
    public String accelerate() {
        return Brands.BENZ.toString() + " is accelerating";
    }

    @Override
    public String applyBreak() {
        return Brands.BENZ.toString() + " applied break";
    }

}

class Toyota extends Car{

    public Toyota(){
        super(Brands.TOYOTA.toString(), 6);
    }

    @Override
    public String  startEngine() {
        return Brands.TOYOTA.name() + " engine started";
    }

    @Override
    public String accelerate() {
        return Brands.TOYOTA.name() + " is accelerating.";
    }

    @Override
    public String applyBreak() {
        return Brands.TOYOTA.name() + " is breaking.";
    }
}

class Kia extends Car{
    public Kia(){
        super(Brands.KIA.toString(), 4);
    }

    @Override
    public String startEngine() {

        return Brands.KIA.name() + " engine started";
    }

    @Override
    public String accelerate() {
        System.out.println();
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String applyBreak() {
        return Brands.KIA.name() + " is breaking.";
    }
}

class CallSuper extends Car{

    public CallSuper() {
        super(Brands.UNBRANDED.toString(), 12);

    }
}

public class Car {

    private String name;
    private String engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private Colors color;
    private boolean isEngineOn;
    private boolean isAccelerating = false;
    

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = "B121";
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 4;
        this.color = Colors.BLACK;
        this.isEngineOn = false;
        this.isAccelerating = false;
    }


    public String startEngine(){

        this.isEngineOn = true;
        return "Base class Engine fired up and running....";
    }

    public String accelerate(){
        return "Base Class Accelerating>>>>>>";
    }

    public String applyBreak(){
        return "Break applied Base car";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}


enum Colors{
    BLACK,WHITE,RED,GREEN,BLUE,YELLOW,ORANGE,VIOLET,PURPLE,PINK
}

enum Brands{
    TOYOTA,MAZDA,VOLVO,BENZ,BMW,PORSHE,BENTLEY,HONDA,HYUNDIA,KIA,PEUGOUT,AUDI,VOLKSWAGEN, UNBRANDED
}


class Main{
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            Car car = randomCar();
            System.out.println(
                    "Car # " + i + " :"
                    + "\n" + "Car Brand : " + car.getName()+ "\n"
                    + "Start Engine: " + car.startEngine() + "\n"
                    + "Accelerate : " + car.accelerate() + "\n"
                    + "Break : " + car.applyBreak() + "\n"
            );
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number generated was : "+ randomNumber);
        switch(randomNumber){
            case 1:
                return new Benz();
            case 2:
                return new Toyota();
            case 3:
                return new Kia();
            case 4:
                return new CallSuper();
            default:
                System.out.println("Nothing to see here...Move along.");
                return null;
        }
    }
}
