package explainingInheritance;

public class Vehicle {
    private int tyres;
    private boolean engine;
    private int speedometer;
    private int gear;
    private String color;
    private int lights;

    public Vehicle(int tyres, boolean engine, int speedometer, String color, int lights) {
        this.tyres = tyres;
        this.engine = engine;
        this.speedometer = speedometer;
        this.color = color;
        this.lights = lights;
    }

    public void steeringHandle(String direction){
        if(moving()){

            switch(direction){
                case "left" : case "right":
                    System.out.println("Vehicle is turning " + direction);
                default:
                    System.out.println("Vehicle is moving straight");
            }
        }
    }

    public void changeGear(){
        if(isOn()){
          if(this.speedometer == 0){
              this.gear = 1;
              System.out.println("Gear shift to " + this.gear);
              this.speedometer += 20;
              System.out.println("vehicle is moving at " + this.speedometer+"km/hr");
          }
          else if(this.speedometer > 20 && this.speedometer <= 40){
              this.gear = 2;
              System.out.println("Gear shift to " + this.gear);
              this.speedometer += 20;
              System.out.println("Vehicle is moving at " + this.speedometer+"km/hr");
          }
          else if(this.speedometer > 40 && this.speedometer <= 60){
              this.gear = 3;
              System.out.println("Gear shift to " + this.gear);
              this.speedometer += 20;
              System.out.println("Vehicle is moving at " + this.speedometer+"km/hr");
          }
          else if(this.speedometer > 60 && this.speedometer <= 80){
              this.gear = 4;
              System.out.println("Gear shift to " + this.gear);
              this.speedometer += 20;
              System.out.println("Vehicle is moving at " + this.speedometer+"km/hr");
          }
          else if(this.speedometer > 80 && this.speedometer <= 100){
              this.gear = 5;
              System.out.println("Gear shift to " + this.gear);
              this.speedometer += 20;
              System.out.println("Vehicle is moving at " + this.speedometer+"km/hr");
          }
          else if(this.speedometer > 100 && this.speedometer <= 120){
              this.gear = 6;
              System.out.println("Gear shift to " + this.gear);
              this.speedometer += 20;
              System.out.println("Vehicle is moving at " + this.speedometer+"km/hr");
          }
          else{
              System.out.println("Speed limit exceeded. Reduce gear.");
          }
        }
    }

    public void applyBreak(){
        if(isOn() && speedometer > 0) {
            this.speedometer = 0;
            System.out.println("Break applied");
        }

        else{
            System.out.println("Vehicle is not running....");
        }
    }

    public boolean isOn(){
        if(engine){
            System.out.println("Vehicle is on");
            return true;
        }
        else{
            System.out.println("Vehicle is not on");
            return false;
        }
    }

    public boolean isOff(){
        if(isOn()){
            System.out.println("Vehicle is on. Turn off");
            return false;
        }
        else{
            System.out.println("Vehicle is turned off.");
            return true;
        }
    }

    public boolean moving(){
        if(isOn() && speedometer < 0) {
            System.out.println("Vehicle is on but not moving.");
            return false;
        }
//        else if(isOn() && speedometer > 0) {
//            System.out.println("Vehicle is on and moving");
//            return true;
//        }
        System.out.println("Vehicle is moving...");
        return isOn() && speedometer > 0;
    }

    public int getTyres() {
        return tyres;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getSpeedometer() {
        return speedometer;
    }

    public int getGear() {
        return gear;
    }

    public String getColor() {
        return color;
    }

    public int getLights() {
        return lights;
    }
}
