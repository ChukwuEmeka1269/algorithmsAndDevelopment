package timbulchalka;

public class OverloadedMethod {
    public static void main(String[] args) {
//        System.out.println(calcFeetAndInchesToCentimeters(-2.3, 8));
        System.out.println(calcFeetAndInchesToCentimeter(157));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(!(feet>=0 && (inches >= 0 && inches <=12)))
            return -1;
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + "feet, " + inches + "inches " + " = " + centimeters + "cm");
        return centimeters ;
    }

    public static double calcFeetAndInchesToCentimeter(double inches){
        if(!(inches >= 0))
            return -1;
        double feet = (int)inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(feet);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}
