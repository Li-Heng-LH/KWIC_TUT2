import java.util.*;

public class KWIC {

    //global shared data here
    List<String> inputs = new ArrayList<String>();
    List<String> shiftedStrings = new ArrayList<String>();

    void run() throws Exception {
        readInputs();
        cicularShift();
        sortStrings();
        printOutputs();
    }
	
    private void readInputs() {
        int numberOfLine;
        Scanner sc = new Scanner(System.in);
        numberOfLine = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numberOfLine; i++) {
            String oneLine = sc.nextLine();
            inputs.add(oneLine);
        }
        sc.close();
    }

    private void printOutputs() {
        for (String line : shiftedStrings) {
            System.out.println(line);
        }
    }

    private void cicularShift() {
        for(int i = 0; i < inputs.size(); i++) {
            String oneLine = inputs.get(i);
            String[] wordArray = oneLine.split("\\s+");
        
            for(int j = 0; j < wordArray.length; j++) {
                String modifiedLine = makeLine(wordArray);
                shiftedStrings.add(modifiedLine);
                wordArray = shiftLine(wordArray);
            }
        }
    }
	
    private String[] shiftLine(String[] wordArray)
    {
        String firstWord = wordArray[0];
        for(int i = 0; i < wordArray.length-1; i++)
            wordArray[i] = wordArray[i+1];
        
        wordArray[wordArray.length-1] = firstWord; 
        return wordArray;
    }
    
    private String makeLine(String[] wordArray)
    {
        String returnString = wordArray[0];
        for(int i = 1; i < wordArray.length; i++)
            returnString += " " + wordArray[i];
        
        return returnString;
    }
	
    private void sortStrings() {
        Collections.sort(shiftedStrings);
    }
    
    public static void main(String[] args) throws Exception {
        KWIC kwic = new KWIC();
        kwic.run();
    }
}
