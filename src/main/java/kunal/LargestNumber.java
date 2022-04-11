package kunal;

public class LargestNumber {
    public static void main(String[] args) {
//        System.out.println(maxVal(50, 160, 900));
        int[]  numbers = {234,6,81,9,3,6};
        System.out.println(maxVal(numbers, 0, 4));
    }

    public static int largestNumber(int a, int b, int c){
        int max = a;
        if(max < b){
            max = b;
            if(max < c){
                max = c;
            }
        }

        return  max;
    }


    public static int maxVal(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    public static int maxVal(int[] numbers){
        int max = numbers[0];
        int i = 0;
        while(i < numbers.length -1){
            if(max < numbers[i]){
                max = numbers[i];
            }
            i++;
        }
        return  max;
    }

    //Finds the max
    public static int maxVal(int[] numbers, int index1, int index2){
        //edge cases
        if(numbers == null || index1 > index2){
            return -1;
        }
        int max = numbers[1];
        int i = index1;
        while(i < index2){
            if(max < numbers[i]){
                max = numbers[i];
            }
            i++;
        }
        return  max;
    }





}
