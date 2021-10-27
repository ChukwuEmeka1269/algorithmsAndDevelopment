package baseconversion;

public class OctalToDecimal {
    public static void main(String[] args) {
        String octalString = "256";
        int convertedDigit = octalToDecimal(octalString);
        System.out.println(convertedDigit);
    }

    public static int octalToDecimal(String octal){
       int conversionSequence = 1;
       int result = 0;
       for(int index=1; index<=octal.length(); index++){
           //To get the character at the current index of the octal string
           char characterAtCurrentIndex = octal.charAt(octal.length() - index);
           //To parse the character into an integer value
           int currentCharacterParseIntoInteger = Integer.parseInt(String.valueOf(characterAtCurrentIndex));
           //perform a base conversion of current integer digit by multiplying the integer with the current conversion sequence
           int baseConversionOfCurrentDigit = conversionSequence * currentCharacterParseIntoInteger;
           //The summation of all the individual base conversion process equals the result of the conversion from octal to decimal
           result += baseConversionOfCurrentDigit;
           //update the conversion sequence.
           conversionSequence *= 8;
       }
       return result;
    }
}
