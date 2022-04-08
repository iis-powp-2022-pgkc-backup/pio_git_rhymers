package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int isEmpty = -1;
	public static final int maxIndex = 11;
	private final int[] numbersArray = new int[maxIndex + 1];
	public int numberOfElements = -1;

	public void countIn(int value) {
		if (!isFull()) {
			numbersArray[++numberOfElements] = value;
		}
	}

	public boolean callCheck() {
		return numberOfElements == isEmpty;
	}
		
	public boolean isFull() {
		return numberOfElements == maxIndex;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return isEmpty;
		}
		return numbersArray[numberOfElements];
	}
			
	public int countOut() {
		if (callCheck()) {
			return isEmpty;
		}
		return numbersArray[numberOfElements--];
	}

}
