package amigoscodeFunctionalPrograming.javabrains;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Lambdas {
    public static void main(String[] args) {
        String name = "Emeka";
        greet.accept(name);

        convertStringToInteger.applyAsInt("45");
    }

    /**
     * Lambda expressions enables us to write code in a functional style in java
     * With lambda expression, we can more readable codes and concise codes.
     */

    //Traditional way of writing codes
//    public static void greet(String word){
////        System.out.println("Hello " + word);
//
//    }

    /*
    In the tradition way of writing functions in java, we write them in methods which must be part of class
    Functional programming addresses this concern in cases where we need to perform an action but we don't want it to belong to a class
    This can be achieved through lambda expression in the functional style of programming.
    Also we can assign this action to a reference variable
     */

    static Consumer<String> greet = (String word) -> System.out.println("Hello " + word);

    static ToIntFunction<String> convertStringToInteger =  string -> {System.out.println(Integer.parseInt(string)); return Integer.parseInt(string);};



}
