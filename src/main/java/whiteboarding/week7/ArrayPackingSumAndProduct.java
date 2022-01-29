package whiteboarding.week7;

import java.util.ArrayList;


public class ArrayPackingSumAndProduct {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        System.out.println("Pack array sum >>>> " );
        System.out.println(packArray(nums));
    }
//
//    public static ArrayList<Integer> packArray(ArrayList<Integer> integers){
//        int sum = 0;
//        int product = 1;
//        for (int i = 0; i < integers.size(); i++) {
//
//        }
//    }

    public static int packArray(ArrayList<Integer> integers) {
        if (integers.isEmpty()) {
            return 0;
        }
        boolean oddIteration = true;
        while (integers.size() > 1) {
            for (int i = 0; i < integers.size(); i++) {
                int replacement;
                if (oddIteration) {
                    replacement = integers.get(i) + integers.get(i + 1);
                } else {
                    replacement = integers.get(i) * integers.get(i + 1);
                }
                integers.set(i, replacement);
                integers.remove(i + 1);
            }
            oddIteration = !oddIteration;
        }
        return integers.get(0);
    }
}
