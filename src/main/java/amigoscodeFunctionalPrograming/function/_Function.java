package amigoscodeFunctionalPrograming.function;

import java.util.function.Function;

//Function in terms of Functional Interfaces
//A Function represents a function that takes in one argument and produces a result
public class _Function {
    public static void main(String[] args) {
        System.out.println(multiplyBy2.apply(4));
        System.out.println(add10.apply(multiplyBy2.apply(4)));
        //We can use method chaining to chain two Functions together by calling the andThen() method,
        //Passing in the other Function and calling the apply() method on the chain.
        System.out.println(multiplyBy2.andThen(add10).apply(4));
    }

    //Normal way
    public static int multiply(int num){
        return num * 2;
    }

    //Function
    public static Function<Integer, Integer> multiplyBy2 = number -> number * 2;

    public static Function<Integer, Integer> add10 = number -> number + 10;
}
