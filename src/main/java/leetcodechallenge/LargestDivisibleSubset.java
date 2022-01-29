package leetcodechallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestDivisibleSubset {

    public static void main(String[] args) {
        int[] nums = {1};
//        System.out.println(nums[0]);
        System.out.println( largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if(nums.length > 2) {
                if (nums[i] % nums[i - 1] == 0) {
                    result.add(nums[i - 1]);
                    result.add(nums[i]);
                }
            }
            else{
                result.add(nums[0]);
            }
        }
        return result;
    }
    public static  List<Integer> largestDivisibleSubset2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int[] answer = {};
//        if(nums.length >= 1 && nums.length <= 1000){
//            for(int i= 0; i<nums.length; i++) {
//
//                for (int j = 1 ; j < nums.length - 1; j++) {
//                    if (nums[j] % nums[i] == 0 || nums[i] % nums[j] == 0) {
//                        answer[i] = nums[j];
//                    }
//
//                    result.add(nums[j]);
//                }
//            }
//        }

        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i< nums.length-1){
                    if (nums[j] % nums[i] ==0){
                        set.add(nums[i]);
//                        set.add(nums[j]);
                    }
                }
            }
        }
        result = List.copyOf(set);
        return result;

    }
}
