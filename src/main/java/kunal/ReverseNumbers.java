package kunal;

public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println(reverseNumber(987654321));
    }

    public static int reverseNumber(int number){
        int temp ;
        int result = 0;
        while(number > 0){
            temp = number % 10;
            number /= 10;
            result = (result * 10) + temp;
        }
        return result;
    }
}
