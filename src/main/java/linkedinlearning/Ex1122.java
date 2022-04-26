package linkedinlearning;

import java.math.BigInteger;

public class Ex1122 {
    public static void main(String[] args) {
        int maxInt = findMaxInt(23, 45, 67);
        System.out.println(maxInt);

    }

    public static void isPalindrome(String input){
        if(input == null || input.isEmpty()){
            System.out.println("Yes");
        }

        StringBuilder builder = new StringBuilder(input);
        String reversedInputString = builder.reverse().toString();
        System.out.println(reversedInputString);

        if(input == reversedInputString){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static BigInteger factorial(int n){
        if(n == 1 || n == 0){
            return BigInteger.ONE;
        }

        BigInteger big = BigInteger.ONE;
        for(int i=2; i<=n; i++){
            big = big.multiply(BigInteger.valueOf(i));
        }

        return big;
    }

    public static int findMaxInt(int a, int b, int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;

    }
}
