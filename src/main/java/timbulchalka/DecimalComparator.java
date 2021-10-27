package timbulchalka;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        return Math.abs((number1 * 1000) - (number2 * 1000)) < 1;
    }


}
