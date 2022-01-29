package codingwithjohn.algorithms;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Generated random numbers before quick sort: ");
        Quicksort.printArray(numbers);




        System.out.println("Generated random numbers after quick sort: ");
        Quicksort.quickSort(numbers);
        Quicksort.printArray(numbers);
    }
}
