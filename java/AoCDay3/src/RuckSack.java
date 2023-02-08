import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RuckSack{
    public ArrayList<String> allContainerContents;
    public String container1Key = "";
    public ArrayList<String> container1Contents;
    public String container2Key = "";
    public ArrayList<String> container2Contents;
    public String sharedItem = "";
    public int priority = 0;

    public ArrayList<String> ALPHABET = new ArrayList<String>(Arrays.asList(
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

    public RuckSack (String containerString){
        // split string by no space
        String[] strSplit = containerString.split("");
        // Now convert string into ArrayList
        ArrayList<String> fullList = new ArrayList<String>(
                Arrays.asList(strSplit));

        allContainerContents = new ArrayList<String>();
        allContainerContents.addAll(fullList);

        List<String> list1 = fullList.subList(0,fullList.size()/2);
        List<String> list2 = fullList.subList((fullList.size()/2),fullList.size());

        container1Contents = new ArrayList<String>();
        container1Contents.addAll(list1);

        container2Contents = new ArrayList<String>();
        container2Contents.addAll(list2);

//        System.out.println("Container 1: " + container1Contents);
//        System.out.println("Container 2: " + container2Contents);

        for(String container1Item : container1Contents){
            if(container2Contents.contains(container1Item)){
                sharedItem = container1Item;
            }
        }

//        System.out.println("Shared Item: " + sharedItem);

        if(ALPHABET.contains(sharedItem)){
            priority = ALPHABET.indexOf(sharedItem) + 1;
        }else if(ALPHABET.contains(sharedItem.toLowerCase())){
            priority = ALPHABET.indexOf(sharedItem.toLowerCase()) + 27;
        }

//        System.out.println("Priority: " + priority);
    }
}


