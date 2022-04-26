package kunal.bit_operator;

/*
Question : Given a number n, find if the is odd or even
 */
public class Example1 {
    public static void main(String[] args) {
       int number = 0;
        oddOrEven(number);
    }

    public static boolean isOdd(int n){
        return ((n & 1) == 1);
    }

    public static void oddOrEven(int n){
        if(n == 0){
            System.out.println("Neither even nor odd");
            return;
        }
        if(n < 0){
            n *= -1;
        }

        if(isOdd(n)){
            System.out.println("Odd");
        }else{

            System.out.println("Even");
        }

    }


}
