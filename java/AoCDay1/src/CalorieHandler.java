import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class CalorieHandler {
    public static ArrayList<Integer> addAndASortElfCalories(ArrayList<Integer> data)
    {
        int currentTotal = 0;
        int thirdHighest = 0;
        int secondHighest = 0;
        int highestTotal = 0;

        ArrayList<Integer> calorieTotals = new ArrayList<>();

        for(Integer item : data)
        {
            currentTotal += item;

            if((item == 0) || (data.lastIndexOf(item) == data.size() - 1)){
                calorieTotals.add(currentTotal);
                currentTotal = 0;
            }
        }
        Collections.sort(calorieTotals, Collections.reverseOrder());

        System.out.println("Calorie Lists Sorted " + calorieTotals);

        System.out.println("High " + calorieTotals.get(0) + " 2nd " + calorieTotals.get(1) + " 3rd " + calorieTotals.get(2));
        return calorieTotals;
    }
}
