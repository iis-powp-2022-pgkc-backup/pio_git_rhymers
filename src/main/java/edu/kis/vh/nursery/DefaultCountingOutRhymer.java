package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 
{
	private static final int fullInt = 11;
	private static final int minusOne = -1;
	private int[] NUMBERS = new int[12];
	public int total = minusOne;

	public void countIn(int in) 
	{
		if (!isFull()) 
		{
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck() 
	{
		return total == minusOne;
	}
		
	public boolean isFull() 
	{
		return total == fullInt;
	}
		
	protected int peekaboo() 
	{
		if (callCheck()) 
		{
			return minusOne;
		}
		return NUMBERS[total];
	}
			
	public int countOut() 
	{
		if (callCheck()) 
		{
			return minusOne;
		}
		return NUMBERS[total--];
	}

}
