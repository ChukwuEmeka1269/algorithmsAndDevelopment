package whiteboarding.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimalSwaps {

    public static void main(String[] args) {
        ArrayList<Integer> ratings = new ArrayList<>();
        ratings.add(3);
        ratings.add(1);
        ratings.add(2);
        ratings.add(4);
        System.out.println(Arrays.toString(ratings.toArray()));
        int swap = minimalSwap(ratings);
        System.out.println(swap);
    }
    public static int minimalSwap(ArrayList<Integer> ratings){
        ArrayList<Integer> temArr = (ArrayList<Integer>) ratings.clone();
        return 4;
    }
}
