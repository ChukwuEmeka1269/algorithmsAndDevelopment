package timbulchalka;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumValueArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] ints = readIntegers(5);
        int min = findMin(ints);
//        int min2 = findMin2(ints);
        System.out.println("The min number in the array" + Arrays.toString(ints) + " = "+min);
//        System.out.println("The min number in the arrayMethod2" + Arrays.toString(ints) + " = "+min2);

    }

    public static int[] readIntegers(int count){
        int[] inputtedNumbers = new int[count];
        System.out.println("Select a number: " + "\r");
        for(int i=0 ; i<inputtedNumbers.length; i++ ){
            inputtedNumbers[i] = scanner.nextInt();
        }
        return inputtedNumbers;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE; // or use min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static int findMin2(int[] array){
        int temp = 0;
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length -1; j++){
                if(array[j] > array[j+1]){
                    temp= array[j];
                    array[i] = array[j+1];
                    array[i+1] = temp;
                }
            }
        }

        return array[0];
    }
}
