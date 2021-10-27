package timbulchalka;

public class Challenge1 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5500;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score " + finalScore );
    }
}
