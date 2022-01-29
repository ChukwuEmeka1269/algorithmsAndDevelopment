package randomAlgorithmChallenges;

import java.util.ArrayList;

public class Atm {
    public static void main(String[] args) {
        System.out.println(withdraw(70));
    }

    public static ArrayList<Integer> withdraw(int amount){
        ArrayList<Integer> result = new ArrayList<>();
        int hundredBills ;
        int fiftyBills = 0;
        int twentyBills = 0;
        int rem100;
        int rem50;
        if (amount >= 40 && amount <= 10000) {
            if (amount % 100 == 0) {
                hundredBills = amount / 100;
                result.add(hundredBills);
                result.add(fiftyBills);
                result.add(twentyBills);
            } else {
                hundredBills = amount / 100;
                rem100 = amount % 100;
                if (rem100 % 50 != 0 && rem100 % 20 != 0) {
                    fiftyBills = rem100 / 50;
                    rem50 = rem100 % 50;
                    twentyBills = rem50 / 20;
                } else {
                    if(rem100 % 50 != 0  && rem100 % 20 == 0){
                        twentyBills = rem100 / 20;
                    }else {
                        fiftyBills = rem100 / 50;
                    }
                }
                result.add(hundredBills);
                result.add(fiftyBills);
                result.add(twentyBills);
            }

        }
        return result;

    }
}
