package kunal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Banana"));
        System.out.println(reverseString("Banana"));
        System.out.println(revString("Banana"));
        System.out.println(checkUniqueCharacters("Banomme"));
        System.out.println(unique("Banomme"));
    }

    public static String reverse(String word){
        String reversed = "";
        int end = word.length() -1;
        while(end >= 0){
            reversed += word.charAt(end);
            end--;
        }
        return reversed;
    }

    public static boolean unique(String word){
        String[] split = word.split("");
        List<String> strings = Arrays.asList(split);
        Set<String> stringHashSet = new HashSet<>(strings);
        return stringHashSet.size() == split.length;
    }

    public static boolean checkUniqueCharacters(String word){
        int start =0;
        int end = word.length() -1;

        while(start < end){
            while(start < word.length()){
                if(word.charAt(start) == word.charAt(end)){
                   if(start == end){
                        break;
                   }
                   return false;
                }else{
                    start++;
                }
            }
            end--;
            start = 0;
        }

        return true;
    }

    public static String reverseString(String word){
        String reversed = "";
        for(int i=word.length()-1; i>=0; i--){
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static String revString(String word){
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }

}
