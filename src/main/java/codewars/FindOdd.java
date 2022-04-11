package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {
    public static void main(String[] args) {
        int[] num = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
//        System.out.println(find(num));
        System.out.println(findItt(num));
    }
    public static int findItt(int[] a) {
        int odd = 0;
        List<Integer> list = new ArrayList<>();

        for (int j : a) {
            list.add(j);
        }

        for (int i = 0; i< list.size(); i++){
            int one = list.get(i);
            if(Collections.frequency(list,one) %2 == 1){
                odd = one;
            }
        }
        return odd;
    }

    public static int find(int[] a){
        int count =0;
        int odd = 0;
        int pivot = 0;
        for(int i=0; i< a.length; i++){
            if(a[pivot] == a[i]){
                count++;
            }else{
                if(i < a.length -1){
                    continue;
                }else{
                    pivot++;
                    i = pivot;
                }
            }

            if(count % 2!=0){
                odd = count;
            }


        }

        return odd;
    }

    public static int findIt(int[] a) {

        int odd = 0;
        int count=0;
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            if(start!= end && a[start]== a[end]){
                count++;
                end--;
            }else {
                if(start < end){
                    end--;
                }else{
                    start++;
                    end = a.length-1;
                }

            }
            odd = count;
        }


        return odd;
    }

    public static void sort(int[] array) {

        boolean isSwapped;
        for (int i = 0; i < array.length; i++) {
            isSwapped = false;
            for (int j = 1; j < array.length -i; j++) {
                int temp;
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isSwapped = true;
                }
            }

            if(!isSwapped){
                break;
            }
        }
    }
}
