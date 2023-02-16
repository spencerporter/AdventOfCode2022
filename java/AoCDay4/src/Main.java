import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<String> inputList = AoCFileReader.readAoCFile("./inputs/simple.txt");
        ArrayList<String> inputList = AoCFileReader.readAoCFile("./inputs/input.txt");

        Integer pairOverlaps = 0;
        ArrayList<CleaningPair> cleaningPairs = new ArrayList<CleaningPair>();
        for(String pairText: inputList){
            CleaningPair newPair = new CleaningPair(pairText);

            cleaningPairs.add(newPair);

            if(newPair.isOverlap) { pairOverlaps++; }
        }

        System.out.println("Total Overlap: " + pairOverlaps);
    }
}