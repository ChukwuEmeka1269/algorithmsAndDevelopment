package kunal;

//The ceil of a number is the smallest number that is greater than or equal to the number in an array
public class CeilNumber {
    public static void main(String[] args) {
        int[] array = {2,3, 4, 5,6 ,7,9,11,56,78,99};
        int target = 120;
        int ans = ceilNumber(array, target);
        System.out.println(ans);

    }

    public static int ceilNumber(int[] array, int target){
        if(target > array[array.length -1]){
            return -1;
        }
        int startIndex = 0;
        int endIndex = array.length - 1;
        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;
//            if(mid == target){
//                return mid;
//            }
//            boolean isAsc = array[startIndex] < array[endIndex];


                if( target < array[mid]){
                    endIndex = mid - 1;
                }
                 else if(target > array[mid]){
                    startIndex = mid + 1;
                } else{
                    return mid;
                }


        }

//        startIndex = endIndex + 1;

        return startIndex;
    }
}
