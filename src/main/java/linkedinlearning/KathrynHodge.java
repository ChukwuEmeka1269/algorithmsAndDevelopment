package linkedinlearning;

public class KathrynHodge {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {32,12,56,77};
        int maxFromArray = findMaxFromArray(arrayOfNumbers);
        int max = findMax(3, 5,9);
        System.out.println("Maximum from given array = "+ maxFromArray + ". \n\rMaximum from 3 numbers = " + max);
    }

    public static int findMax(int a, int b, int c){
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }

        return max;
    }

    public static int findMaxFromArray(int[] array){
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}
