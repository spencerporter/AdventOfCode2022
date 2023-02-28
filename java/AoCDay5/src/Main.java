import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<String> inputList = AoCFileReader.readAoCFile("./inputs/simple.txt");
        ArrayList<String> inputList = AoCFileReader.readAoCFile("./inputs/input.txt");

        CargoHold cargoHold = new CargoHold(inputList);
//        cargoHold.executeMovesStack();
        cargoHold.executeMovesQueue();

        System.out.println("Top Values " + cargoHold.getTopCargo());
    }
}