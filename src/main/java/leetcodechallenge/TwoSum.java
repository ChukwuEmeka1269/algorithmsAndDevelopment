package leetcodechallenge;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,4,5,3};
        int target = 5;
        int[] twoSum = sum3(nums, target);

        System.out.println(Arrays.toString(twoSum));
    }

    public static int[] twoSum(int[] nums, int target){

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static int[] sum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++){
            int compliment = target - nums[j];
            if(map.containsKey(compliment) && map.get(compliment) != j){
                return new int[] {j, map.get(compliment)};
            }
        }
        return null;
    }

    public static int[] sum3(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {i, map.get(compliment)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
