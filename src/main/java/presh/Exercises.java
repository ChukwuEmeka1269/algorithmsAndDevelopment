package presh;

public class Exercises {
    public static void main(String[] args) {
        int [] arr = {3,2,1,4,1};
        int ans = centered(arr);
        System.out.println(ans);
    }

    public static int centered(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        if(arr.length == 1){
            return 1;
        }

        if(arr.length % 2 == 0){
            return 0;
        }else{
            int start = 0;
            int end = arr.length -1;
            int mid = (start + end)/2;
            int count =0;
            for (int j : arr) {
                if (arr[mid] >= j && j!= arr[mid]) {
                    count++;
                }
            }
            if(count > 0){
                return 0;
            }else{
                return 1;
            }
        }

    }
}
