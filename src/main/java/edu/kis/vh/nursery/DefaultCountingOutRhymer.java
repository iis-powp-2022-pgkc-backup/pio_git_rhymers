package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int[] numbers = new int[size]; // final albo malymi

	public int total = -1;

	final static int size = 12;
	final static int empty = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	public boolean callCheck() {
		return total == empty;
	}


	public boolean isFull() {
		return total == size-empty;
	}

	protected int peekaboo() {
		if (callCheck())
			return empty;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return empty;
		return numbers[total--];
	}

}
