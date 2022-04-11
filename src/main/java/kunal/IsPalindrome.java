package kunal;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome2(" "));
        System.out.println(isPalindrome3(" "));
    }

    public static boolean isPalindrome(String word){
        if(word == null || word.length() == 0){
            return true;
        }
        int start = 0;
        int end = word.length() -1;

        while(start < end){
            if(word.charAt(start) == word.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String word){
        if(word == null || word.length() == 0){
            return true;
        }
        int start = 0;
        int end = word.length() -1;

        for(int i=0;i< word.length()/2; i++){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String word){
        if(word == null || word.length() == 0){
            return true;
        }
        for(int i=0; i<word.length(); i++){
            char start = word.charAt(i);
            char end = word.charAt(word.length() -1 -i);

            if(start != end ){
                return false;
            }
        }
        return true;
    }




}
