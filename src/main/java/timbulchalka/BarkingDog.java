package timbulchalka;

public class BarkingDog {
    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(false, 2);
        System.out.println(wakeUp);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else return isBarking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
