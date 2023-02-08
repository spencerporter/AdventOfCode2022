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
        int ruckTrackerForTrios = 0;
        String one = "";
        String two = "";

        ArrayList<ThreeRuckGroup> ruckTrios = new ArrayList<ThreeRuckGroup>();
        for(String ruckString : ruckList){
            RuckSack newRuckSack = new RuckSack(ruckString);
            allRucks.add(newRuckSack);
            totalRuckPriorityCount += newRuckSack.priority;

            ruckTrackerForTrios++;
            System.out.println(ruckTrackerForTrios % 3);
            switch (ruckTrackerForTrios % 3){
                case 1:
                    one = ruckString;
                    break;
                case 2:
                    two = ruckString;
                    break;
                default:
                    ruckTrios.add(new ThreeRuckGroup(one, two, ruckString));
            }
        }
        int threeRuckPriorityCt = 0;
        for(ThreeRuckGroup threeRuck: ruckTrios){
            threeRuckPriorityCt += threeRuck.priority;
        }
        System.out.println("Total Rucksack Priority: " + totalRuckPriorityCount);
        System.out.println("Total Trio Rucksack Priority: " + threeRuckPriorityCt);
    }
}