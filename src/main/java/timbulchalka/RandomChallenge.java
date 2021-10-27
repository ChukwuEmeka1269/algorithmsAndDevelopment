package timbulchalka;

public class RandomChallenge {
    public static void main(String[] args) {
        int[] people = {25,25,25, 100, 25, 50, 25, 50,25, 100};
        System.out.println(Tickets(people));
    }

    public static String Tickets(int[] peopleInLine) {
        int count = 0;
        int count2 = 0;


//        for (int index = 0; index < peopleInLine.length; index++) {
//            if(peopleInLine[index]==25){
//                count++;
//                if(count>=1 && peopleInLine[index + 1]== 50)
//                    return "yes can give change for $50";
//            }
//            if(peopleInLine[index]==25 && peopleInLine[index + 1]== 50){
//                count2++;
//                if(count2>=1 && peopleInLine[index]==100)
//                    return "yes can give change for $100";
//            }
//        }
        if (peopleInLine[0] > 25) return "NO";

        for (int i : peopleInLine) {
            if (i == 25) {
                count++;
            }

            if (i == 50) {
                count2++;
                count--;
            }
            if (i == 100) {
                if (count2 > 0) {
                    count2--;
                    count--;
                } else {
                    count -= 3;
                }
            }

            if (count < 0) return "NO";
//                if(count>=1 && peopleInLine[index]==50)
//                    return "YES for 50";
//                if((count2>=1 && count >=1) && peopleInLine[index]==100)
//                    return "YES for 100";

        }
        return "YES";
    }
}
