package kunal;


public class FibonacciNumber {

    public static void main(String[] args) {
//        System.out.println(fib(9));
        System.out.println(nthFib(47));
    }

    //Nth fibonacci number
    public static long fib(int nthFib){
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

    //Solving recursively
    public static int nthFib(int num){
        if(num < 2){
            return num;
        }

        return nthFib(num -1) + nthFib(num -2);
    }
}
