import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class AoCFileReader
{
    public AoCFileReader(String filePath)
    {

    }

    public static ArrayList<Integer> readAoCFile(String filePath) throws IOException
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        File inputFile = new File(filePath);
        BufferedReader buffer = new BufferedReader(new FileReader(inputFile));
        String row = "";
        while ((row = buffer.readLine()) != null)
        {
//            String[] data = row.split(",");
//            for(int i = 0; i < data.length; i++)
//            {
//                if(data[i].equals(""))
                if(!row.equals(""))
                {
                    result.add(Integer.parseInt(row));
                }else{
                    result.add(0);
                }
//            }
        }
        buffer.close();
        return result;
    }
}