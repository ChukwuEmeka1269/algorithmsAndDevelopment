package timbulchalka;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(500));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59))
            return INVALID_VALUE_MESSAGE;
        int hour = minutes / 60 ;
        int remainingMinutes = minutes % 60;
//        String hourString = hour + "h ";
//        if(hour<10)
//            hourString = "0" + hourString;
//
//        String minutesString = remainingMinutes + "m ";
//        if(remainingMinutes<10)
//            minutesString = "0" + minutesString;
//
//        String secondsString = seconds + "s";
//        if(seconds<10)
//            secondsString = "0" + secondsString;

        String hourString = checkValue(hour, 'h');
        String minutesString = checkValue(remainingMinutes, 'm');
        String secondsString = checkValue(seconds, 's');

        System.out.println(minutes + "min " + seconds + "secs" + " = " + hourString + " " + minutesString + " " + secondsString);
        return hourString + " " + minutesString + " " + secondsString ;

    }

    private static String getDurationString(int seconds){
        if(seconds < 0)
            return INVALID_VALUE_MESSAGE;
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    private static String checkValue(int value, char initial){
        String variable = value + String.valueOf(initial);
         if(value<10)
             variable = "0" + variable;
         return variable;
    }
}
