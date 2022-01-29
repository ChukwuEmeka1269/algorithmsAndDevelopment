package timbulchalka;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {

        int[] array = {2,4,5,6,7};
        reverse(array);
    }

    public static void reverse(int[] array){
        int temp = 0;
        int halfway = array.length /2 ;
        int maxIndex = array.length -1;
        System.out.println("Array = " + Arrays.toString(array));
        for(int i=0; i< halfway; i++){
           temp = array[i];
           array[i] = array[maxIndex -i];
            array[maxIndex-i] = temp;
        }
        System.out.println("Reversed Array = "+Arrays.toString(array));
    }
}
