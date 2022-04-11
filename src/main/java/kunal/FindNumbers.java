package kunal;

public class FindNumbers {
    public static void main(String[] args) {
        int[] array = {3, 6, 81,9, 7234,24};
        int numberOfEvenNumbers = findNumbers(array);
        System.out.println(numberOfEvenNumbers);
        System.out.println(digits2(98576565));
        System.out.println(digits2(9857665));
        System.out.println(digits2(-957665));
        System.out.println(digits2(0));
    }

    public static int findNumbers(int[] array){
        int count =0 ;
        for(int element :  array){
            if(even2(element)){
                count++;
            }
        }
        return count;
    }

    //Counting the digits in a number
    private static boolean even(int element) {
        int count = 0;
        while(element>0){
            count++;
            element /= 10;
        }

        return (count % 2 == 0);
    }

    //Converting to String first then using the length to determine whether it is even or odd
    private static boolean even2(int element){
        String stringValue = String.valueOf(element);
        return (stringValue.length()%2 ==0);
    }

    private static int digits(int number){
        int count = 0;
        //edge cases
        if(number < 0){
            number = number * (-1);
        }

        if(number == 0){
            return 1;
        }
        while(number>0){
            count++;
            number/=10 ;
        }

        return count;
    }

    //Optimised way of counting number of digits
    private static int digits2(int number){
        //handle edge cases
        if(number < 0){
            number = number * (-1);
        }
        if(number == 0){
            return 1;
        }

        return (int)Math.log10(number) + 1;
    }

}
