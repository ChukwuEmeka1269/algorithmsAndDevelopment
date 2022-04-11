package kunal;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int number){
        int original = number;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + (rem * rem * rem);
            number /= 10 ;
        }
        return sum == original;
    }
}
