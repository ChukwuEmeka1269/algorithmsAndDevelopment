package katryn;

import java.util.Arrays;

public class CheckUpperCase {
    public static void main(String[] args) {
//        String upper = "HELLO";
//        String lower = "hello";
//
//        System.out.println(isUpperCase(upper));
//        System.out.println(isLowerCase(lower));

    }

    public static boolean isUpperCase(String string){
        return string.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String string){
        return string.chars().noneMatch(Character::isUpperCase);
    }


}
