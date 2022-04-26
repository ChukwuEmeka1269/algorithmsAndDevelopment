package linkedinlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,33,68};
        int target = 0;
        int[] primeNumbers = primeNumbers(numbers);
        StringBuilder builder = new StringBuilder();
        for(int i=0; ; i++){
            builder.append(primeNumbers[i]);
            if(i == primeNumbers.length-1){
                break;
            }
            builder.append(",");
        }
        System.out.println(builder);

    }

    public static Integer linearSearch(int[] arr, int item){
        return Arrays.stream(arr).filter(num -> num == item).findFirst().orElse(-1);
    }

    public static int binarySearch(int[] arr, int item){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
           if(item > arr[mid]){
               start = mid + 1;
           }else if(item < arr[mid]){
               end = mid -1;
           }else{
               if(item == arr[mid]){
                   return mid;
               }
           }
        }
        return -1;
    }

    public static int[] primeNumbers(int[] arr){
        List<Integer> primes = new ArrayList<>();
        for (int j : arr) {
            if (isPrime(j)) {
                primes.add(j);
            }
        }
        return primes.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isPrime(int num){
        boolean prime = false;
        if(num == 1){
            return false;
        }
        if(num < 0){
            num = -(num);
        }
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }else if(num % i != 0) {
                prime = true;
            }
        }
        return prime;
    }
}
