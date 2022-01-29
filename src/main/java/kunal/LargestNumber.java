package kunal;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(maxVal(50, 160, 900));
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
}
