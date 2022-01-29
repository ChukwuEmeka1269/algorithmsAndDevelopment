package timbulchalka_object_oriented.composition;

public class MainRoom {
    public static void main(String[] args) {

        Toilet toilet = new Toilet(1, false);
        Bathroom bathroom = new Bathroom(toilet, 1);
        Wadrobe wadrobe = new Wadrobe(10);
        AirConditioner airconditioner = new AirConditioner(true);
        Bed bed = new Bed(3600, 4, "Blue");
        Room room = new Room(bathroom, wadrobe, 1, airconditioner, bed, true);
        room.getAirconditioner().turnOn();
        room.getBathroom().getToilet().flush();
        room.getBathroom().turnOnShower();

    }
}
