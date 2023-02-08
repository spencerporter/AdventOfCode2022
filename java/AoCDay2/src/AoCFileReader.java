import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class AoCFileReader
{
    public AoCFileReader(String filePath)
    {

    }

    public static ArrayList<String> readAoCFile(String filePath) throws IOException
    {
        ArrayList<String> result = new ArrayList<>();
        File inputFile = new File(filePath);
        BufferedReader buffer = new BufferedReader(new FileReader(inputFile));
        String row = "";
        while ((row = buffer.readLine()) != null)
        {
            System.out.println("Input: " + row);
            result.add(row);
        }
        buffer.close();
        return result;
    }
}