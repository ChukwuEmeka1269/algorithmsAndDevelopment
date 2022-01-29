package codingwithjohn.algorithms;

import java.util.Random;

public class Quicksort {

    public static void printArray(int[] numbers) {
        for(int i=0; i< numbers.length; i++){
            System.out.println((i+1) + numbers[i]);
        }
    }

    public static void quickSort(int[] numbers) {
        quickSort(numbers, 0, numbers.length -1);
    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex -lowIndex)+ lowIndex;
        int pivot = numbers[pivotIndex];
        swap(numbers, pivotIndex, highIndex);

        int leftPointer = partitionIntoSubArray(numbers, lowIndex, highIndex, pivot);

        quickSort(numbers, lowIndex, leftPointer -1);
        quickSort(numbers, leftPointer+1, highIndex);

    }

    private static int partitionIntoSubArray(int[] numbers, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }

        swap(numbers, leftPointer, highIndex);

        return leftPointer;

    }


    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

