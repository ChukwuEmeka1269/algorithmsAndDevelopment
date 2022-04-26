package kunal.bit_operator;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberInAnArray {
    public static void main(String[] args) {
        int[] numbers = {2,4,3,2,4,3,5,1,1, 5, 66};
        System.out.println(unique(numbers));

        BigInteger bigInteger = BigInteger.valueOf(65);
    }

    public static int findUnique(int[] numbers){
        int unique = 0;
        for(int number:numbers){
            unique^= number;
        }
        return unique;
    }

    public static int unique(int[] numbers){
        int ans = 0;
       List<Integer> integerList =  Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for (Integer integer : integerList) {
            if (Collections.frequency(integerList, integer) == 1) ans = integer;
        }
        return ans;


    }

}
