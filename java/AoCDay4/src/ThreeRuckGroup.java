import java.util.ArrayList;
import java.util.Arrays;

public class ThreeRuckGroup {
    public RuckSack ruck1;
    public RuckSack ruck2;
    public RuckSack ruck3;

    public String sharedItem = "";

    public int priority = 0;

    public ArrayList<String> ALPHABET = new ArrayList<String>(Arrays.asList(
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

    public ThreeRuckGroup (String one, String two, String three){
        ruck1 = new RuckSack(one);
        ruck2 = new RuckSack(two);
        ruck3 = new RuckSack(three);

        for(String ruck1Item : ruck1.allContainerContents){
            if(ruck2.allContainerContents.contains(ruck1Item) && ruck3.allContainerContents.contains((ruck1Item))){
                sharedItem = ruck1Item;
            }
        }

        System.out.println("Shared Item: " + sharedItem);

        if(ALPHABET.contains(sharedItem)){
            priority = ALPHABET.indexOf(sharedItem) + 1;
        }else if(ALPHABET.contains(sharedItem.toLowerCase())){
            priority = ALPHABET.indexOf(sharedItem.toLowerCase()) + 27;
        }

        System.out.println("Priority: " + priority);
    }
}
