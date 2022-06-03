package randomAlgorithmChallenges;

import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {
        int[] num = {3, 10, 20, 1, 2};
//        System.out.println(sjf());
    }

    public static int sjf(ArrayList<Integer> jobs, int index) {
        int res = 0;
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i) < jobs.get(index) || (jobs.get(i) == jobs.get(index) && i <= index)) {
                res += jobs.get(i);
            }
        }
        return res;
    }
}
