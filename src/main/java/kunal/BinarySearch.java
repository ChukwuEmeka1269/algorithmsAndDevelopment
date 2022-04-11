package kunal;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] array = {0,1,2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 34, 45, 56, 67, 89, 99, 150};
//        int[] array2 = {100, 99, 88, 77, 66, 55, 44, 33, 22, 11, 10, 9, 7, 5, 3, 2, 1,0};
//        int target = 230;
//        int ans = orderAgnosticBinarySearch(array2, target);

//        System.out.println(ans);
//
//        System.out.println(search(array, target, 0, array.length -1));
//        System.out.println(search(array2, target, 0, array.length -1));

//        int[] array = {2,3, 5, 9, 14, 16, 18};
//        int ceil = ceil(array, 20);
//        int floor = floor(array, 20);
//
//        System.out.println("Ceil: "+ceil);
//        System.out.println("Floor: "+floor);

        int[] array = {2,4,5,7,7,7,7,8,9};
        int target = 7;

        int[] ints = firstAndLastOccurrence(array, target);
        System.out.println(Arrays.toString(ints));


    }

    //Handles only arrays sorted in ascending manner
    static int binarySearch(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length - 1;
        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;
            if(target > array[mid]){
                startIndex = mid + 1;
            } else if(target < array[mid]){
                endIndex = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //Handles both ascending and descending order arrays
    public static int orderAgnosticBinarySearch(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length -1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;
            if(array[mid] == target){
                return mid;
            }
            boolean isAscending = array[startIndex] < array[endIndex];
            if(isAscending){
                if(target > array[mid]){
                    startIndex = mid + 1;
                }else{
                    endIndex = mid - 1;
                }
            }

            if(!isAscending){
                if(target > array[mid]){
                    endIndex = mid -1;
                } else{
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }


    //Using recursive programming
    public static int search(int[] array, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(array[mid] == target){
            return mid;
        }

        if(target<array[mid]){
            end = mid -1;
            if(array[end]==target){
                return end;
            }
            return search(array, target, start, mid -1);
        }else{
            start = mid + 1;
            if(array[start] == target){
                return start;
            }
            return search(array, target, start, end);
        }
    }

    public static int ceil(int[] array, int target){
        //This solution is based on the assumption that the array has been sorted in ascending order
        //in case where the array has not been sorted, to find the ceil of a number, first sort the array,
        // then use binary search to find the ceil

        int startIndex = 0;
        int endIndex = array.length -1;
        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;

            if(target > array[array.length-1]){
                return  -1;
            }
            if(array[midIndex] == target){
                return midIndex;
            }

            if(array[midIndex] < target){
                startIndex = midIndex +1;
            }else{
                endIndex = midIndex-1;
            }
        }

        return startIndex;

    }

    public static int floor(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target > array[end] && target < array[start]){
                return  -1;
            }
            if(array[mid] == target){
                return mid;
            }
            if(target > array[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return end;
    }

    //To find the start and end position of an element in an array: assuming the array is a sorted array

    public static int[] firstAndLastOccurrence(int[] array, int target){

        //Brute Force solution: to have 2 pointers start and end. Whenever start == target, we have found
        // start position and whenever the end == target, we have found the end position.
        //This solution runs at O(N) time complexity
//        int start = 0;
//        int end = array.length-1;
//        int[] ans = {-1, -1};
//        for(int i=0; i< array.length; i++){
//
//            if(ans[0]!= -1 && ans[1]!= -1){
//                return  ans;
//            }
//            if(target != array[start]&&target != ans[0]){
//                    start++;
//
//            }else{
//                ans[0] = start;
//            }
//            if(target != array[end] && target != ans[1]){
//                    end--;
//            }else{
//                ans[1] = end;
//            }
//
//
//        }


        //Optimised solution using binary search twice.
        //First time to find the first occurrence of target and Second time to find the last occurrence of the target
        //This solution runs at O(log N) time complexity

        int[] ans  = {-1, -1};

        ans[0] = search(array, target, true);
        if(ans[0] != -1){
            ans[1]= search(array, target, false);
        }

        return ans;
    }

    private static int search(int[] array, int target, boolean isFirst){
        int start = 0;
        int end = array.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < array[mid]){
                end = mid - 1;
            } else if(target > array[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(isFirst){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
