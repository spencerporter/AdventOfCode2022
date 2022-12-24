import java.util.ArrayList;

public class CalorieHandler {
    public static int calculateMostCalariesByElf(ArrayList<Integer> data)
    {
        int currentTotal = 0;
        int highestTotal = 0;
        for(Integer item : data)
        {
            if(item == 0){
                if(highestTotal < currentTotal){
                    highestTotal = currentTotal;
                }
                currentTotal = 0;
            }else{
                currentTotal += item;
            }
        }
        return highestTotal;
    }
}
