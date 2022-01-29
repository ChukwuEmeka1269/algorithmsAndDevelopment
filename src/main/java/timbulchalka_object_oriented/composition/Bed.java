package timbulchalka_object_oriented.composition;

public class Bed {
    private int size;
    private int pillows;
    private String sheetsColor;

    public Bed(int size, int pillows, String sheetsColor) {
        this.size = size;
        this.pillows = pillows;
        this.sheetsColor = sheetsColor;
    }

    public int getSize() {
        return size;
    }

    public int getPillows() {
        return pillows;
    }

    public String getSheetsColor() {
        return sheetsColor;
    }
}
