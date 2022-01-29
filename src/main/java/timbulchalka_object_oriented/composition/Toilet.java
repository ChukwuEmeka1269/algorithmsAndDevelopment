package timbulchalka_object_oriented.composition;

public class Toilet {
    private int toiletSeat;
    private boolean isFlush;

    public Toilet(int toiletSeat, boolean isFlush) {
        this.toiletSeat = toiletSeat;
        this.isFlush = isFlush;
    }

    public boolean flush(){
        if(toiletSeat > 0){
            System.out.println("Flushing.....");
            return this.isFlush = true;
        }
        else{

            System.out.println("......");
            return this.isFlush = false;
        }
    }

    public int getToiletSeat() {
        if(toiletSeat < 0){
            System.out.println("Your toilet has no seat");
            return -1;
        }
        else {
            return toiletSeat;
        }
    }


}
