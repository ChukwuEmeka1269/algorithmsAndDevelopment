package timbulchalka;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean equalSum = hasEqualSum(1, 2, 3);
        System.out.println(equalSum);
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return ((num1 + num2) == num3);
    }
}
