import java.util.*;

public class KWIC {
	void run() throws Exception {

		Input input = new Input();
		CircularShift circularShift = new CircularShift();
		Alphabetizer alphabetizer = new Alphabetizer();
		Output output = new Output();

		List<String> data = new ArrayList<String>();

		input.InputData(data);
		input.run();
		data = input.OutputData();

		circularShift.InputData(data);
		circularShift.run();
		data = circularShift.OutputData();

		// for debug
		/*
		 * for(String d : data) System.out.println(d);
		 */

		// TODO: li heng
		// alphabetizer.InputData(data);
		// alphabetizer.run();
		// data = alphabetizer.OutputData();

		// output.InputData(data);
		// output.run();
		// should do the printing inside Output.java
	}

	public static void main(String[] args) throws Exception {
		KWIC kwic = new KWIC();
		kwic.run();
	}
}
