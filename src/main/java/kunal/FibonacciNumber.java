package kunal;


public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    //Nth fibonacci number
    public static int fib(int nthFib){
        int count = 2;
        int prev = 0;
        int current = 1;
        while(count <= nthFib){
            int temp = current;
            current = current + prev;
            prev = temp;
            count++;
        }
        return current;
    }
}
