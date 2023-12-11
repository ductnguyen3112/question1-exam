package Prints;

import java.util.Objects;

public class Prints {
	// print Queue

	private String[] printName;
	private int printPosition;


	public void enqueue(String name) {
		if (printName == null) {
			printName = new String[1];
			printName[0] = name;
			printPosition = 0;
		} else {
			String[] temp = new String[printName.length + 1];
			for (int i = 0; i < printName.length; i++) {
				temp[i] = printName[i];
			}
			temp[printName.length] = name;
			printName = temp;
			printPosition++;
		}
	}

	public Prints(String[] printName, int printPosition) {
		this.printName = printName;
		this.printPosition = printPosition;
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



	public void isEmpty() {
		if (printName == null) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Queue is not empty");
		}
	}

	public String dequeue() {
		if (printName == null) {
			System.out.println("Queue is empty");
			return null;
		} else {
			String name = printName[printPosition];
			printName[printPosition] = null;
			printPosition--;
			return name;
		}
	}


	public String peak() {
		return printName;
	}

	// clear
	public void clear() {
		printName = null;
		printPosition = 0;
	}

}
