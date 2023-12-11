package Prints;

import java.util.Objects;

public class Prints {

	private String printName;
	private int printPosition;



	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}
	
	public int getPrintPosition() {
		return printPosition;
	}

	public void setPrintPosition(int printPosition) {
		this.printPosition = printPosition;
	}

	///is queue empty
	public boolean isEmpty() {
		return printName == null;
	}
		// dequeue
	public void dequeue() {
		printName = null;
		printPosition = 0;
	}





	




	
	
}
