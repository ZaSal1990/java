
public class displayHighScorePosition {

    public static void main (String[] args) {
        int scoreGameOne = calculateHighScorePosition(1500);
        displayHighScorePosition("Zahra", scoreGameOne);

    }

    public static void displayHighScorePosition(String playerOne, int playerPosition) {
        System.out.println(playerOne + " managed to get " + playerPosition + " on the high score table");
    }
     public static int calculateHighScorePosition (int playerScore) {
        if (playerScore > 1000)
            return 1;
        else if (playerScore > 500 && playerScore < 1000)
            return 2;
           else if (playerScore > 100 && playerScore < 500)
                return 2;
                else return 4;
     }
    
}