package codingwithjohn.algorithms;

public class Fibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
//        System.out.println(processFibonacci(50));
        processFibonacci(2);
//        printNthFibonacciNumber();

    }

    private static void processFibonacci(int n){
        fibonacciCache = new long[n+1];

        long fibonacciNumber = fibonacciNumber(n);
        switch (n){
            case 1:
                System.out.println("The "+ n+ "st Fibonacci number is: " + fibonacciNumber);
                break;
            case 2:
                System.out.println("The "+ n+"nd Fibonacci number is: "+ fibonacciNumber);
                break;
            case 3:
                System.out.println("The "+ n+"rd Fibonacci number is: "+ fibonacciNumber);
                break;
            default:
                System.out.println("The "+ n+"th Fibonacci number is: "+ fibonacciNumber);
        }
//        return fibonacciNumber;
    }

    private static long fibonacciNumber(int n){
        //Checking for the base condition
        if(n <= 1){
            return n;
        }
        //checking for previously calculated fibonacci number which has been stored.
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        //Memoization -> Storing the values of calculated fibonacci number in an array.
        long nthFibonacciNumber = (fibonacciNumber(n -1) + fibonacciNumber(n -2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }

    public static void printNthFibonacciNumber(){
        for (long fibNumber : fibonacciCache) {
            System.out.println(fibNumber + " ");
        }
    }
}
