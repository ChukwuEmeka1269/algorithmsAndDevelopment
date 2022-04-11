package amigoscodeFunctionalPrograming.bifunction;

import java.util.function.BiFunction;

//A BiFunction is a Function which takes in two input and produces one result
public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(addAndMultiplyBiFunction.apply(10, 5));
    }

    static BiFunction<Integer, Integer, Integer> addAndMultiplyBiFunction = (num2Add, num2MultiplyBy) -> (20 + num2Add) * num2MultiplyBy;
}


//Generally the idea of Bi is a function that takes in two argument. This idea applies to other Bis such as BiPredicate which is boolean function
