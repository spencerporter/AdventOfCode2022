import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;

public class CargoHold {
    public ArrayList<Stack> cargoBays = new ArrayList<Stack>();
    public ArrayList<String> movementList = new ArrayList<String>();
    public String cargoBayNumbers = "";
    public Integer cargoBayCount = 0;

    public CargoHold(ArrayList<String> input){
        // Seperate CargoList/Bay#List & Movement List
        ArrayList<String> cargoBaysLines = new ArrayList<String>();
        for(String line: input){
            if(!line.replace(" ", "").equals("") ){
                if (line.replace(" ", "").charAt(0) == '[') {
                    //This is a cargo line
                    line = line.replace("    ",",").replace("[" , "").replace("]",",");
                    if(line.replace(" ", "") != ""){
                        cargoBaysLines.add(line.replace(" ", ""));
                    }
                } else if (line.replace(" ", "").charAt(0) == '1') {
                    //This is the cargo bay line
                    cargoBayNumbers = line.replace(" ", "");
                    cargoBayCount = cargoBayNumbers.length();
                } else {
                    line = line.replace("move", "")
                            .replace("from",",")
                            .replace("to", ",");
                    movementList.add(line.replace(" ", ""));
                }
            }
        }

        System.out.println("Cargo Lines " + cargoBaysLines);
        System.out.println("Cargo Bays " + cargoBayNumbers);
        System.out.println("Movement List " + movementList);
        System.out.println("Cargo Bay Count " + cargoBayCount);

        // Step through the Cargo Rows and parse out/push the cargo into the stacks
        for(int i = 0; i < cargoBayCount; i++)
        {
            cargoBays.add(new Stack());
        }
        for(String cargoLine: cargoBaysLines)
        {
            String[] lineArray = cargoLine.split(",");
            for(int binNumber = 0; binNumber < lineArray.length; binNumber++){
                if(!lineArray[binNumber].equals(""))
                {
                    cargoBays.get(binNumber).push(lineArray[binNumber]);
                }
            }
        }

        for(int i = 0; i < cargoBayCount; i++){
            Stack reverseStack = new Stack();
            int stackSize = cargoBays.get(i).size();
            for(int j = 0; j < stackSize; j++){
                String poppingString =  (String) cargoBays.get(i).pop();
                reverseStack.push(poppingString);
            }
            cargoBays.set(i,reverseStack);
        }
    }

    public void executeMovesStack(){
        System.out.println("Stack Starter Bays " + cargoBays);
        for(String movement : movementList){
            String[] movementArray = movement.split(",");
            Integer amount = new Integer(movementArray[0]);
            Integer start = new Integer(movementArray[1]) - 1;
            Integer end = new Integer(movementArray[2]) - 1;

            System.out.println("Moving #" + amount + " From " + start + " End " + end);

            for(int i = 0; i < amount; i++){
                cargoBays.get(end).push(cargoBays.get(start).pop());
                System.out.println("Move Executed " + cargoBays);
            }
        }
    }

    public void executeMovesQueue(){
        System.out.println("Queue Starter Bays " + cargoBays);
        for(String movement : movementList) {
            String[] movementArray = movement.split(",");
            Integer amount = new Integer(movementArray[0]);
            Integer start = new Integer(movementArray[1]) - 1;
            Integer end = new Integer(movementArray[2]) - 1;

            System.out.println("Moving " + amount + " amount from " + start + " to " + end);
            Stack<String> moveStack = new Stack<String>();
            for (int i = 0; i < amount; i++) {
                moveStack.add((String) cargoBays.get(start).pop());
            }
            System.out.println("Move Queue" + moveStack);
            int moveQueueSize = moveStack.size();
            for (int i = 0; i < moveQueueSize; i++) {
                cargoBays.get(end).push(moveStack.pop());
            }

            System.out.println("Move Executed " + cargoBays);
        }
    }

    public String getTopCargo(){
        String topCargo = "";

        for(int i = 0; i < cargoBayCount; i++){
            System.out.println("Top Peek: " + cargoBays.get(i).peek());
            if(cargoBays.get(i).peek() != null){
                topCargo += (String) cargoBays.get(i).peek();
            }
        }

        return topCargo;
    }
}
