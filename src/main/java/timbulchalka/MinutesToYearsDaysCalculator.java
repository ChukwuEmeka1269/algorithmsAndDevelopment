package timbulchalka;

public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0)
            System.out.println(INVALID_VALUE_MESSAGE);

        else {
            long years = minutes / 525600L;
            long days = minutes / 1440;
            System.out.println(days);
            long remainingDays = 0;
            if (days >= 365) {
                remainingDays = days - 365;
            }else{
                remainingDays = days;
            }
            System.out.println(minutes + " min " + "= " + years + " y " + "and " + remainingDays + " d");
        }
    }
}
