package kunal;

import java.util.*;

//

public class SortingAlgorithms {
    public static void main(String[] args) {
//        int[] array = {4,2,1,3,7,0,9,6,8,10,13,12,11,15,14,5};
        int[] array = {1,1};
//        System.out.println(getMax(array, 4, 6));
//        System.out.println(getMin(array, 10, 13));
//        cyclic(array);

        List<Integer> missingElement = findAllMissingElement(array);
        System.out.println(Arrays.toString(array));

        int[] missingNums = missingElement.stream().mapToInt(num -> num).toArray();
        System.out.println(Arrays.toString(missingNums));

    }

    public static List<Integer> findAllMissingElement(int[] array){
        List<Integer> missingNumbers = new ArrayList<>();
        int pointer = 0;
        while(pointer < array.length){
            int correctIndex = array[pointer]-1;
            if(array[pointer] < array.length){
                if(array[pointer] != array[correctIndex]){
                    swap(array, pointer, correctIndex);
                }else{
                    pointer++;
                }
            }else{
                pointer++;
            }
        }

        for(int index=0; index< array.length; index++){
            if(array[index] != index+1){
                missingNumbers.add(index+1);
            }
        }


        return missingNumbers;
    }

    public static int findMissingElement(int [] array){
       int pointer = 0;
        while(pointer < array.length){
            int correctIndex = array[pointer];
            if(array[pointer] < array.length){
                if(array[pointer] != array[correctIndex]){
                    swap(array, pointer, correctIndex);
                }else{
                    pointer++;
                }
            }else{
                pointer++;
            }
        }

        for (int i = 0; i < array.length ; i++) {
            if(i != array[i]){
                return i;
            }
        }

       return array.length;
    }

    /*
    Important steps in selection sort
    1. Select an element from the array
    2. Swap it with its correct position

    Selection sort is an unstable sorting algorithm i.e it does not preserve the position of identical elements
    Time Complexity : Worse Case == Best Case => O(N^2)
    Space Complexity : O(1)
     */
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length -i -1;
//            int startIndex = i;

            int minIndex = getMin(array, i, array.length-1);
            //get the max element
//            int maxIndex = getMax(array, 0, lastIndex);
            //swap with correct index position
            swap(array, i, minIndex);
//            swap(array, maxIndex, lastIndex);
        }
    }

    private static int getMin(int[] array, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if(array[min] > array[i]){
                min = i;
            }
        }
        return min;
    }

    /*
        Insertion sort does a kind of partial sorting
        @ every index, insert the element @ that index to the right position
        Time Complexity: Worse Case == O(N^2), Best Case == o(N)
        Space Complexity: O(1) Linear
        Use Case: Adaptive i.e steps get reduced in comparison to bubble sort
        used for smaller values of N.
        Works best for partially sorted arrays.
        Pros:  Stable algorithm
     */
    public static void insertionSort(int [] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(array[j] < array[j-1]){
                    swap(array, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    /*
        Works for arrays running from 0 - (n-1)
        For range in 1 - n change the condition to index = array[index] - 1
     */
    public static void cyclic(int[] array){
        int pointer = 0;
        while(pointer < array.length){
            if(array[pointer] == array[array[pointer]]){
                pointer++;
            }else{
                swap(array, pointer, array[pointer]);
            }
        }
    }

    public static void cyclicSort(int[] array){
        for (int i = 0; i <array.length-1 ; ) {
            if(array[i] == array[array[i]]){
                i++;
            }else{
                swap(array, i, array[i]);
            }
        }
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int getMax(int[] array, int startIndex, int lastIndex) {
        int max = startIndex;
        for (int j = startIndex; j <=lastIndex; j++) {
            if(array[max] < array[j]){
                max = j;
            }
        }
        return max;

    }

    public static int[] bubbleSort(int[] array){
        boolean swapped;
        for (int i = 0; i < array.length ; i++) {
            swapped =false;
            for (int j = 1; j < array.length -i; j++) {
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                swapped = true;
            }

            if(!swapped){
                return array;
            }
        }

        return array;

    }

}
