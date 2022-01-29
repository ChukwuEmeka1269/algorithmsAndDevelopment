package timbulchalka;

public class LargestPrimeNumber {
    public static void main(String[] args) {

        System.out.println(largestPrime(10));
    }

    public static int largestPrime(int number){
        if(number < 2)
            return -1;
        for(int i=2; i< number; i++){
            if((number % i) == 0){
                number /= i;
                i--;
            }
        }
        return number;
    }
}
