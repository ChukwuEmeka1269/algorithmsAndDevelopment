package kunal;
//The aim of this class is to find the target element in an infinite array
//Approach:
//          We are assuming that the array is a sorted array. Therefore binary search is an
//          efficient solution rather than a linear search.
//          The approach is to search for the target in chunks. Since we do not know the length of the array,
//          We cannot determine the start and end index of the entire array. What we can do is to start from somewhere within the
//          array preferably from index 0 and move in chunks expanding the the size of the array chunks exponentially.
public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] array = {2,5,6,7,8,9,11,14,15,18,22,24,25,26,28,33,55,66,78,85,93,124};
        int target = 25;
        System.out.println(infiniteSearch(array, target));
    }

    public static int infiniteSearch(int[] array, int target){
        int start = 0;
        int end = 1;

        while(target > array[end]){
            //double the array chunk
            int newStart = end + 1;
            end = end + (end - start+ 1)*2;

            start = newStart;
        }

        return binarySearch(array, target, start, end);
    }

    public static int binarySearch(int[] array, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < array[mid]){
                end = mid -1;
            }else if(target > array[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
