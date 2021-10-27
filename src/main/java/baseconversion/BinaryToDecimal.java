package baseconversion;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String binary = "10110110111010101010101011";
        System.out.println(convertBinaryToDecimal(binary));
    }

    public static int convertBinaryToDecimal(String binaryString){
        int conversionSequence = 1;
        int result = 0;
        for(int i=1; i<=binaryString.length(); i++){
            //check if the character in the current octal string is equal to 1
            //Only process the conversion of character in octal string with value equals 1
            if(binaryString.charAt(binaryString.length()-i) == '1')
                result += conversionSequence;
            //update the conversion sequence for processing in the next iteration
            conversionSequence *=2;
        }
        return result;
    }

}
