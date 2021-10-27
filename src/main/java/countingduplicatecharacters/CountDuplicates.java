package countingduplicatecharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class CountDuplicates {
    public static void main(String[] args) {

        System.out.println(countDuplicateCharacter("Lukaku") + "Hey!");
        System.out.println(countDuplicateCharacters("Lukaku"));
        System.out.println(countDuplicate("Banana"));
    }
    
    public static Map<Character, Integer> countDuplicateCharacter(String word){
        Map<Character, Integer> result = new HashMap<>();
        for(char ch: word.toCharArray())
            result.compute(ch, (k, v)->(v==null)?1:++v);
        return result;
    }

    public static Map<Character, Long> countDuplicateCharacters(String word){
        return word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }

    /*
    solving the problem to account for unicode as well as ASCII
     */

    public static Map<String, Integer> countDuplicate(String word){
        Map<String, Integer> result = new HashMap<>();
        for(int i=0; i<word.length(); i++){
            int codePt = word.codePointAt(i);
            String characterAtCodePoint = String.valueOf(Character.toChars(word.codePointAt(i)));
            if(Character.charCount(codePt)== 2)
                i++;
            result.compute(characterAtCodePoint, (k, v)->(v==null)?1:++v);
        }

        return result;
    }


    public static Map<String, Long> countDuplicates(String word){
        return word.codePoints()
                .mapToObj(c->String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }



}
