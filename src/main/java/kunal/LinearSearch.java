package kunal;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] array2D =  {
                {23,56,13, 9},
                {1, 5, 6},
                {34, 66}
        };

        int ans = searchMax(array2D);
        System.out.println(ans);
    }

    public static int letterCount(String word, char letter){
        int count = 0;
        for (int i = 0; i <word.length() ; i++) {
            if(letter == word.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean search(String word, char target){
        for (int i = 0; i <word.length() ; i++) {
            if(target ==  word.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int target){
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == target){
                System.out.println(target + " was found at index position "+ i);
                return i;
            }
        }
        System.out.println(target + " Not found.");
        return -1;
    }

    public static int[] search(int[][] array2D, int target){
        for(int row =0; row< array2D.length; row++){
            for(int col = 0; col < array2D[row].length; col++){
                if(array2D[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int searchMax(int[][] array2D){
        int max = Integer.MIN_VALUE;
        for(int[] array : array2D){
            for(int element :  array){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }

}
