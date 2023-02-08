import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<String> playList = AoCFileReader.readAoCFile("./inputs/simple.txt");
        ArrayList<String> playList = AoCFileReader.readAoCFile("./inputs/input.txt");

        System.out.println(playList);
        Integer score = RockPaperScissors.calculateRPSScore(playList);

        System.out.println("Score Results: " + score);

        Integer day2Score = RockPaperScissors.calculateRPSScoreSpecial(playList);
        System.out.println("Day 2 Results " + day2Score);
    }
}