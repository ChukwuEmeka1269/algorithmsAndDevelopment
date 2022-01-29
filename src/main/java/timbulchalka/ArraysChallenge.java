package timbulchalka;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] integers = getIntegers(6);
        printArray(integers);
        System.out.println("Array of sorted integers printed below using my method: ");
        printArray(sortArray(integers));

        System.out.println("Array of sorted integers printed below using Tim's method: ");
        printArray(timSortedSolution(integers));


    }

    public static int[] getIntegers(int number){
        int [] inputtedNumbers = new int[number];
        System.out.println("Please enter "+ number + " numbers. \r");
        for(int i = 0; i< inputtedNumbers.length; i++){
            inputtedNumbers[i] = scanner.nextInt();
        }


        return inputtedNumbers;
    }

    public static void printArray(int[] intArray){
        for(int i=0; i< intArray.length; i++){
            System.out.println("Input number at "+ i + " = "+ intArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] sortArray(int[] array){
        int temp = 0;
        for(int i= 0; i< array.length; i++){
            for(int j = 0; j < array.length - 1 ; j++){
                if(array[j+1] > array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        return array;


    }


    public static int[] timSortedSolution(int[] array){
        int [] sortedArray = Arrays.copyOf(array, array.length);

        int temp;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i< sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
