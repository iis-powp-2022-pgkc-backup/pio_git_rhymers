package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class FIFORhymer extends defaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
		// TODO Auto-generated constructor stub
	}

	public final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
