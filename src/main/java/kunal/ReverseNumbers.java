package kunal;

import java.util.Arrays;

public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println(reverseNumber(0));
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int reverseNumber(int number){
        int temp ;
        int result = 0;
        while(number > 0){
            temp = number % 10;
            number /= 10;

            result = (result * 10) + temp;
        }
        return result;
    }

    public static int[] reverseArray(int[] array){
        //edge cases
        if(array == null || array.length == 1){
            return array;
        }
        int temp ;
        int lowIndex = 0;
        int highIndex = array.length -1;
        while(lowIndex < highIndex){
            temp = array[lowIndex];
            array[lowIndex] = array[highIndex];
            array[highIndex] = temp;

            lowIndex++;
            highIndex--;
        }

        return array;
    }
}
