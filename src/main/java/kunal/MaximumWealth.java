package kunal;

import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,3,4}, {5,4}};
        int wealth = maximumWealth(accounts);
        System.out.println(wealth);
    }

    public static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int rowSum = 0;
            for (int account : person) {
                rowSum += account;
            }
            if (max < rowSum) {
                max = rowSum;
            }
        }
        return max;
    }
}
