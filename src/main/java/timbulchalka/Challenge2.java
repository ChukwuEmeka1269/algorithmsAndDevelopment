package timbulchalka;

public class Challenge2 {
    public static void main(String[] args) {
        int highScoreTable = calculateHighScorePosition(1500);
        displayHighScorePosition("Francis",highScoreTable);
         highScoreTable = calculateHighScorePosition(900);
        displayHighScorePosition("Fabian", highScoreTable);
        highScoreTable = calculateHighScorePosition(400);
        displayHighScorePosition("Tobi", highScoreTable);
        highScoreTable = calculateHighScorePosition(50);
        displayHighScorePosition("Emeka", highScoreTable);

        highScoreTable = calculateHighScorePosition(1000);
        displayHighScorePosition("Nonso", highScoreTable);

    }

    public static void displayHighScorePosition(String name, int positionInHigh){
        System.out.println("Player " + name + " managed to get into position " + positionInHigh + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000)
            return 1;
        else if(playerScore >=500 )
            return 2;
        else if(playerScore >= 100 )
            return 3;
        else return 4;
    }
}
