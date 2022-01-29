package countingduplicatecharacters;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {

    public static void main(String[] args) {
        String word  = "Maranatha";
        System.out.println(count(word));
    }

    public static Map<Character, Integer> count(String word){
        Map<Character, Integer> result = new HashMap<>();
        for(char ch : word.toCharArray()){
            result.compute(ch, (k, v) -> (v==null)? 1: ++v);
        }
        return result;
    }
}
