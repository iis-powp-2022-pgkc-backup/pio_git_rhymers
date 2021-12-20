package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	/**
	 *
	 */
	private static final int _12 = 12;

	/**
	 *
	 */
	private static final int MINUS_ONE = -1;

	private int[] NUMBERS = new int[_12];

	public int total = MINUS_ONE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == MINUS_ONE;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return MINUS_ONE;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return MINUS_ONE;
						return NUMBERS[total--];
					}

}
