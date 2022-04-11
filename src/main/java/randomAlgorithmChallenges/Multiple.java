package randomAlgorithmChallenges;

import java.util.Arrays;

public class Multiple {

    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int multiple = multiple(array);
        System.out.println(multiple);
    }

    public static int multiple(int[] array){
        int result = 1;
        for(int i=0; i< array.length; i++){
          result *= array[i];
        }
        return result;
    }
}
