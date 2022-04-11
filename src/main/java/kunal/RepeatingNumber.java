package kunal;


public class RepeatingNumber {
    public static void main(String[] args) {
        String a = "2";
        String b = "4";
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
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

    public static int sortDesc(int num){
        char[] chars = Integer.toString(num).toCharArray();
        for(int i=0; i<chars.length; i++){
            boolean isSwapped = false;
            for(int j=i+1; j<chars.length; j++){
                if(chars[i]<chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    isSwapped =true;
                }
            }

            if(!isSwapped){
                break;
            }
        }
        String s = String.valueOf(chars);

        return Integer.parseInt(s);
    }


    public static int squareDigits(int n) {
        if(n==0){
            return n;
        }
        int temp ;
        //Since we cannot loop through an int, then we need to first convert to a string array
        //Use a StringBuilder to append the squares at the first index i.e 0
        String[] arr = String.valueOf(n).split("");
        StringBuilder builder = new StringBuilder(arr.length);
        while(n!=0){
            temp = n % 10;
            builder.insert(0, temp * temp);
            n /= 10;
        }
        return Integer.parseInt(builder.toString());
    }

    public static int francisSquareDigit(int n){
        String[] arr = String.valueOf(n).split("");
        String eme = "";
        eme.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append((int) Math.pow(Integer.parseInt(s), 2));
        }

        return Integer.parseInt(builder.toString());
    }

    public static int sumDigits(int n) {
       String[] str = String.valueOf(n).split("");
       String num = String.valueOf(n);
//       StringBuilder builder = new StringBuilder();



       return 1;
    }

}
