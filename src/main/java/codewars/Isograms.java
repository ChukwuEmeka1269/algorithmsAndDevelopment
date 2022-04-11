package codewars;

public class Isograms {
    public static void main(String[] args) {
        String str =  "01234";
        System.out.println(isIsogram(str));
    }

    public static boolean  isIsogram(String str) {
        if(str.length()==0) return true;
        int start =0;
        int end = str.length() -1;

        while(start < end){
            String lowerCase = str.toLowerCase();
            if(lowerCase.charAt(start) == lowerCase.charAt(end)){
                return false;
            }else if(lowerCase.charAt(start) != lowerCase.charAt(end)){
                end--;
                if(end == 0){
                    start++;
                    end = str.length()-1;
                }
            }


        }
        return true;
    }
}
