package kunal;

//The floor of a number is the greatest number that is smaller than or equal to the the target number
public class FloorNumber {
    public static void main(String[] args) {
        int [] array = {2, 3, 5, 7, 8, 9, 87, 98, 678};
        int target = 1;
        int ans = floorNumber(array, target);
        System.out.println(ans);
    }

    public static int floorNumber(int[] array, int target){

//        if(target < array[0]){
//            return -1;
//        }

        int start = 0;
        int end = array.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > array[mid]){
                start = mid + 1;
            }else if(target < array[mid]){
                end = mid -1;
            } else{
                return mid;
            }
        }

        return end;
    }
}
