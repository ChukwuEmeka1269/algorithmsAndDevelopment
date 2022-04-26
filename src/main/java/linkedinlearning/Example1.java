package linkedinlearning;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
//        String someWord = "Helloworld";
//        System.out.println(reverseString(someWord));
        String sentence = "    This ball, is a black ball. I like playing football.";
        System.out.println(reverseWord(sentence));
    }

    public static boolean isUpperCase(String word){
        return word.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String word){
        return word.chars().noneMatch(Character::isUpperCase);
    }

    public static boolean validateString(String word){
        return word.chars().anyMatch(Character::isUpperCase)
                && word.chars().anyMatch(Character::isLowerCase)
                && word.chars().anyMatch(Character::isDigit) && word.length() >= 8;
    }

    /*
    Reversing a string
     */

    public static String reverseString(String string){
        StringBuilder builder = new StringBuilder();
        if(string == null || string.isEmpty()){
            return string;
        }else{
            for(int i= string.length()-1; i>=0; i--){
                builder.append(string.charAt(i));
            }
            return  builder.toString();
        }
    }

    public static String reverseWord(String stringWord){
        if(stringWord == null || stringWord.isEmpty()){
            return stringWord;
        }

        StringBuilder builder = new StringBuilder();
        String[] arrayOfString = stringWord.trim().replaceAll("\\p{Punct}", "").split(" ");
        System.out.println(Arrays.toString(arrayOfString));
        for(int i=0; i<arrayOfString.length; i++){
            for(int j= arrayOfString[i].length()-1; j>=0; j--){
                builder.append(arrayOfString[i].charAt(j));
            }
            if(i != arrayOfString.length - 1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
