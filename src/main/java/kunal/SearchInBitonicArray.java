package kunal;

public class SearchInBitonicArray {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,8,5,4,2};
        int target = 17;
        System.out.println(searchInBitonicArray(array,target));
    }

    public static int searchInBitonicArray(int [] array, int target){
        //find peak index
        int peakIndex = peakIndex(array);
        int firstSearch = orderAgnosticSearch(array, 0, peakIndex, target);
        if(firstSearch != -1){
            return firstSearch;
        }

        return orderAgnosticSearch(array, peakIndex+1, array.length-1, target);
    }

    //Step 1: find the peak index
    public static int peakIndex(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start < end){
            int mid = start + (end -start)/2;

            if(array[mid] > array[mid +1]){
                end = mid;
            }else{
                start = mid +1;
            }
        }

        return start;
    }
    //Step 2: Do an order agnostic binary search for asc half
    public static int orderAgnosticSearch(int [] array, int start, int end, int target){
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target == array[mid]){
                return mid;
            }

            boolean isAsc = array[start] < array[end];
            if(isAsc){
                if(target < array[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
            if(!isAsc){
                if(target < array[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    //Step 3:
}
