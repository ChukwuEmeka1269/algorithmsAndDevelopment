package timbulchalka_object_oriented.composition;

public class AirConditioner {
    private boolean isOn;

    public AirConditioner(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println("AC is on");
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println("AC is off.");
    }

    public boolean isOn() {
        return isOn;
    }
}
