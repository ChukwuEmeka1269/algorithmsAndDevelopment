package kunal;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] array = {5,5,5,5,7,7,7,7,7};
        int target = 7;

        int[] ans = searchInRange(array, target);
        System.out.println(Arrays.toString(ans));

    }


    //Optimised solution. Time Complexity O(log N)
    public static int[] searchInRange(int[] array, int target){
        int[] result = {-1, -1};
        int start = findInRange(array, target, true);
        int end = findInRange(array, target, false);

        result[0] = start;
        result[1] = end;

        return result;
    }

    private static int findInRange(int[] array, int target, boolean isStartIndex) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int targetIndex = -1;
        while(startIndex<= endIndex){
            int mid = startIndex + (endIndex -startIndex)/2;

            if(target > array[mid]){
                startIndex = mid + 1;
            }else if(target < array[mid]){
                endIndex = mid -1;
            }else{
                targetIndex = mid;
                if(isStartIndex){
                    endIndex = mid -1;
                }else{
                    startIndex = mid + 1;
                }
            }
        }

        return targetIndex;
    }

    //No so efficient solution. Time Complexity is O(n)
    private static int[] firstAndLastIndex(int[] array, int target) {
        int startIndex = 0;
        int endIndex = array.length -1;
        int[] ans = new int[2];

        while(startIndex < endIndex){
            if(target > array[endIndex] && target < array[startIndex]){
                ans = new int[]{-1, -1};
            }

            if(target == array[startIndex]){
                ans[0] = startIndex;
            }else{
                startIndex++;
            }
            if(target == array[endIndex]){
                ans[1] = endIndex;
            }else{
                endIndex--;
            }

            if(array[startIndex] == array[endIndex]){
                break;
            }

        }
        ans =  new int[] {startIndex, endIndex};
        return ans;
    }
}
