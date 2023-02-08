import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<String> ruckList = AoCFileReader.readAoCFile("./inputs/simple.txt");
        ArrayList<String> ruckList = AoCFileReader.readAoCFile("./inputs/input.txt");

        ArrayList<RuckSack> allRucks = new ArrayList<RuckSack>();
        int totalRuckPriorityCount = 0;
        for(String ruckString : ruckList){
            RuckSack newRuckSack = new RuckSack(ruckString);
            allRucks.add(newRuckSack);
            totalRuckPriorityCount += newRuckSack.priority;
        }
        System.out.println("Total Rucksack Priority: " + totalRuckPriorityCount);
//        System.out.println(allRucks);
    }
}