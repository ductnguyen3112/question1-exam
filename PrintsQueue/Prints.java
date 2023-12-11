package Prints;

import java.util.Objects;

public class Prints {
	// print Queue

	private String[] printName;
	private int printPosition;

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

	// check the queue
	public void printQueue() {
		if (printName == null) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Queue is not empty");
		}
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
