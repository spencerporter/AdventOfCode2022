import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> caloriesList = AoCFileReader.readAoCFile("./inputs/simple.txt");
        ArrayList<Integer> caloriesList = AoCFileReader.readAoCFile("./inputs/input.txt");

        System.out.println(caloriesList);

        int highestTotal = CalorieHandler.calculateMostCalariesByElf(caloriesList);

        System.out.println("Highest Calories " + highestTotal);
    }
}