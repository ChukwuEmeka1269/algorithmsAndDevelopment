package timbulchalka;

public class LeapYearCalculator {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year){
        if(!(year>=1 && year <= 9999)) {
            System.out.println("Out of range");
        }
        else{
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        System.out.println("This is a leap year.");
                        return true;
                    }
                }else{
                    System.out.println("This is a leap year");
                    return true;
                }
            }
            System.out.println("This is not a leap year");
        }
        return false;
    }
}
