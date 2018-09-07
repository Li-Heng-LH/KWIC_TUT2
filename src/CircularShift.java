import java.util.*;
import java.util.List;

public class CircularShift implements IPipe{
	
	List<String> inputData;
	List<String> outputData = new ArrayList<String>();


	public void InputData(List<String> input)
	{
		inputData = input;
	}
	
	public List<String> OutputData()
	{
		return outputData;
	}
	
	
	public void run()
	{
		for(int i = 0; i < inputData.size(); i++)
		{
			String oneLine = inputData.get(i);
			String[] wordArray = oneLine.split("\\s+");
			for(int j = 0; j < wordArray.length; j++)
			{
				String modifiedLine = makeLine(wordArray);
				outputData.add(modifiedLine);
				
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
}
