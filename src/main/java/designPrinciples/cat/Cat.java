package designPrinciples.cat;

public class Cat {
    private String energy;
    private final Food food;

    public Cat(String energy) {
        this.energy = energy;
        this.food = new Sausage();
    }

    public void getEnergy() {
        this.energy += eat();
    }

    private String eat(){
        this.food.getNutrition();
        return "I have eaten a nutritious food.";
    }


}


class Main{
    public static void main(String[] args) {
        Cat cat = new Cat("High");
        cat.getEnergy();
    }
}
