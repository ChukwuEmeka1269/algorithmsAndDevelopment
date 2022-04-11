package codewars;

public class DigitalRoots {
    public static void main(String[] args) {
        int num = 97;
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int n){
        String[] str = String.valueOf(n).split("");
        if(str.length == 1){
            return n;
        }
        int result = 0;

        for (String value : str) {
            result += Integer.parseInt(value);
        }
        return sumOfDigits(result);
    }
}
