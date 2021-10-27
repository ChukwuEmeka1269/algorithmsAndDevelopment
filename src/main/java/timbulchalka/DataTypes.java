package timbulchalka;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println(convertPoundsToKilograms(250)+"kg");
    }

    public static double convertPoundsToKilograms(double pounds){
        return pounds * 0.45359237;
    }
}
