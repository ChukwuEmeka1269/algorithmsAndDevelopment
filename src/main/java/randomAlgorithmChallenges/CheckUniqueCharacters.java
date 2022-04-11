package randomAlgorithmChallenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(solution2("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*(?/|<>,.¬"));
    }

    public static boolean solution2(String word){
        String [] arr = word.split("");
        List<String> list = Arrays.asList(arr);
        Set<String>  set = new HashSet<>(list);
        return set.size() == arr.length;
    }

    public static boolean solution3(String word){
        boolean flag = true;
        for(int i=0; i< word.length(); i++){
            for(int j= i+1; j< word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static boolean solution4(String word){
        int start = 0;
        int end = word.length() -1;
        while(start < end){
            while(start < word.length()){
                if(word.charAt(start) == word.charAt(end)){
                    if(start == end){
                        break;
                    }
                    return false;
                }else{
                    start += 1;
                }
            }
            end--;
            start = 0;
        }
        return true;
    }
}
