package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
	final private int dwanascie = 12; //or twelve
	final private int[] numbers = new int[dwanascie];

	final private int minusJeden= -1;
	public int total = minusJeden;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
