package kunal;

public class Prime {
    public static void main(String[] args) {
        String numberPrime = prime2(1);
        System.out.println(numberPrime);
    }

    public static String isNumberPrime(int number){
        int temp = 2;
        boolean flag = true;
        while(flag){
            flag = false;
            if(temp < number){
                if(number % temp != 0){
                    temp++;
                    if(temp == number){
                        return number + " is prime.";
                    }
                    flag = true;
                }
            }
        }

        return number + " is not prime number";
    }

    public static String prime(int number){
        if(number <=1){
            return "Prime number must be greater than 1";
        }

           for (int temp = 2; temp < number; temp++) {
               if(number % temp == 0){
                   return number + " is not prime";
               }
           }
       return number + " is prime";
    }

    //Optimized using the square root of given number
    public static String prime2(int number){
        if(number <= 1){
            return " number is neither composite nor prime";
        }
        int temp = 2;
        while(temp * temp  < number){
            if(number % temp == 0){
                return number+ " is not a prime";
            }
            temp++;
        }
        return number + " is prime";
    }
}
