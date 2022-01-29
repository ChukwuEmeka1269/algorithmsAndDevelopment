package timbulchalka_object_oriented.composition;

public class Room {
    private Bathroom bathroom;
    private Wadrobe wadrobe;
    private int tables;
    private AirConditioner airconditioner;
    private Bed bed;
    private boolean lights;

    public Room(Bathroom bathroom, Wadrobe wadrobe, int tables, AirConditioner airconditioner, Bed bed, boolean lights) {
        this.bathroom = bathroom;
        this.wadrobe = wadrobe;
        this.tables = tables;
        this.airconditioner = airconditioner;
        this.bed = bed;
        this.lights = lights;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public Wadrobe getWadrobe() {
        return wadrobe;
    }

    public int getTables() {
        return tables;
    }

    public AirConditioner getAirconditioner() {
        return airconditioner;
    }

    public Bed getBed() {
        return bed;
    }

    public boolean isLights() {
        return lights;
    }
}
