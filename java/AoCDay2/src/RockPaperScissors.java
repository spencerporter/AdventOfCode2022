import java.util.ArrayList;
import java.util.Collections;

public class RockPaperScissors {
    public static int WIN = 6;
    public static int LOSS = 0;
    public static int DRAW = 3;
    public static int ROCK = 1;
    public static int PAPER = 2;
    public static int SCISSORS = 3;
    public static String ENEMY_ROCK = "A";
    public static String ENEMY_PAPER = "B";
    public static String ENEMy_SCISSORS = "C";
    public static String PLAYER_ROCK = "X";
    public static String PLAYER_PAPER = "Y";
    public static String PLAYER_SCISSORS = "Z";
    public static Integer calculateRPSScore(ArrayList<String> data)
    {
        int score = 0;
        System.out.println("Data: " + data);
        for(String game : data)
        {
            String[] moves = game.split(" ");
            System.out.println("Game " + moves[0] + " vs " + moves[1]);
            switch (moves[1]){
                case "X":
                    score += 1;
                    if(moves[0].equals("A")){
                        //Draw
                        score += 3;
                    }else if(moves[0].equals("B")){
                        //Paper vs Rock - Comp wins
                        score += 0;
                    }else if(moves[0].equals("C")){
                        //Scissors vs Rock - Player Wins
                        score += 6;
                    }
                    break;
                case "Y":
                    score += 2;
                    if(moves[0].equals("A")){
                        //Rock vs Paper - Player Wins
                        score += 6;
                    }else if(moves[0].equals("B")){
                        //Paper vs Paper - Draw
                        score += 3;
                    }else if(moves[0].equals("C")){
                        //Scissors vs Paper - Player Loss
                        score += 0;
                    }
                    break;
                case "Z":
                    score += 3;
                    if(moves[0].equals("A")){
                        //Rock vs Scissors - Player Loses
                        score += 0;
                    }else if(moves[0].equals("B")){
                        //Paper vs Scissors - Player wins
                        score += 6;
                    }else if(moves[0].equals("C")){
                        //Scissors vs Scissors - Draw
                        score += 3;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Score after game: " + score);
        }
        return score;
    }
    public static Integer calculateRPSScoreSpecial(ArrayList<String> data)
    {
        int score = 0;
        System.out.println("Data: " + data);
        for(String game : data)
        {
            String[] moves = game.split(" ");
            System.out.println("Game " + moves[0] + " vs " + moves[1]);
            switch (moves[1]){
                case "X": // Loss
                    score += 0;
                    if(moves[0].equals("A")){
                        //Scissors
                        score += 3;
                    }else if(moves[0].equals("B")){
                        //Paper
                        score += 1;
                    }else if(moves[0].equals("C")){
                        //Scissors
                        score += 2;
                    }
                    break;
                case "Y": // Draw
                    score += 3;
                    if(moves[0].equals("A")){
                        //Rock
                        score += 1;
                    }else if(moves[0].equals("B")){
                        //Paper vs Paper - Draw
                        score += 2;
                    }else if(moves[0].equals("C")){
                        //Scissors vs Paper - Player Loss
                        score += 3;
                    }
                    break;
                case "Z": //Win
                    score += 6;
                    if(moves[0].equals("A")){
                        //Rock vs Scissors - Player Loses
                        score += 2;
                    }else if(moves[0].equals("B")){
                        //Paper vs Scissors - Player wins
                        score += 3;
                    }else if(moves[0].equals("C")){
                        //Scissors vs Scissors - Draw
                        score += 1;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Score after game: " + score);
        }
        return score;
    }
}
