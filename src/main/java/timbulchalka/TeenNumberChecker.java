package timbulchalka;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(23, 99, 18));
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return ((num1 >= 13 && num1 <= 19) || (num2 >=13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));
    }
}
