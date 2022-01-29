package timbulchalka_object_oriented.composition;

public class Bathroom {
    private Toilet toilet;
    private int shower;

    public Bathroom(Toilet toilet, int shower) {
        this.toilet = toilet;
        this.shower = shower;
    }

    public void turnOnShower(){
        System.out.println("Shower is running.....");
    }

    public void turnOffShower(){
        System.out.println("Shower is not running....");
    }

    public Toilet getToilet() {
        return toilet;
    }

    public int getShower() {
        return shower;
    }
}
