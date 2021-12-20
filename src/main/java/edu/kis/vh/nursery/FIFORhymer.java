package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			TEMP.countIn(super.countOut());
		int ret = TEMP.countOut();
		while (!TEMP.callCheck())
			countIn(TEMP.countOut());
		return ret;
	}
}
