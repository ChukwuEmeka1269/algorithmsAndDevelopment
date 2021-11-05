package controlFlowsTimBul;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

//        char character = 'E';
//        switch(character){
//            case 'A': case 'B': case 'C': case 'D': case 'E':
//                System.out.println("Testing for " + character);
//                break;
//            default:
//                System.out.println("Not found");
//                break;
//        }

//
//        System.out.println("Please enter a day of the week.");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        Days day = Days.valueOf(input.toUpperCase());
//
//
//        do{
//            if (day.name().equalsIgnoreCase(input)) {
//                switch (day) {
//                    case MONDAY:
//                    case TUESDAY:
//                    case WEDNESDAY:
//                    case THURSDAY:
//                    case FRIDAY:
//                    case SATURDAY:
//                    case SUNDAY:
//                        System.out.println("Today is " + day);
//                        break;
//                    default:
//                        System.out.println("In what calender is this day available?");
//                        break;
//                }
//            } else {
//                System.out.println("What day did you input?");
//            }
//        }
//        while(day.name().equalsIgnoreCase(input));





        while(true){
            System.out.println("Please enter a day of the week.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            Days day = Days.valueOf(input.toUpperCase());
            if (day.name().equalsIgnoreCase(input)) {
                switch (day) {
                    case MONDAY:
                    case TUESDAY:
                    case WEDNESDAY:
                    case THURSDAY:
                    case FRIDAY:
                    case SATURDAY:
                    case SUNDAY:
                        System.out.println("Today is " + day);
                        break;
                    default:
                        System.out.println("In what calender is this day available?");
                        break;
                }
            } else {
                System.out.println("What day did you input?");
            }

        }

    }
}

enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
