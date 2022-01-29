package kunal;

public class RepeatingNumber {
    public static void main(String[] args) {
        System.out.println(repeatNum(95558476, 5));
    }

    public static int repeatingNumber(int number, int numberToCheck){
        int counter = 0;
        while(number > 0){
            int rem = number % 10;
            if(rem == numberToCheck){
                counter++;
            }
            number /= 10 ;
        }
        return counter;
    }

    public static int repeatNum(int number, int numberToCheck){

        String stringValue = String.valueOf(number);
        int counter =0;
        for (int i = 0; i <stringValue.length() ; i++) {
            if(stringValue.charAt(i) == Character.forDigit(numberToCheck, 10)){
                counter++;
            }
        }
        return counter;
    }

}
