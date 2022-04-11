package kunal;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] array = {0,1,2,4,5,6,3,2,0};
        System.out.println(peakIndexInMountainArray(array));
    }

    public static int peakIndexInMountainArray(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start < end){
            int mid = start + (end - start)/2;

            if(array[mid] > array[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}
