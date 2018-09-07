import java.util.*;

public class Input implements IPipe{
	
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
		int numberOfLine;		
		
		Scanner sc = new Scanner(System.in);
		numberOfLine = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numberOfLine; i++)
		{
			String oneLine = sc.nextLine();
			outputData.add(oneLine);
		}
		sc.close();
	}

}
