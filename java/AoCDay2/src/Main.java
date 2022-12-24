import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> caloriesList = AoCFileReader.readAoCFile("./inputs/simple.txt");
        ArrayList<Integer> caloriesList = AoCFileReader.readAoCFile("./inputs/input.txt");

        System.out.println(caloriesList);

        ArrayList<Integer> sortedElfCalories = CalorieHandler.addAndASortElfCalories(caloriesList);

        System.out.println("Highest Calories " + sortedElfCalories.get(0));

        Integer topThreeCalories = sortedElfCalories.get(0) + sortedElfCalories.get(1) + sortedElfCalories.get(2);

        System.out.println("3 Highest Calories " + topThreeCalories);
    }
}