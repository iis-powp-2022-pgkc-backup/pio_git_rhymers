package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class HanoiRhymer extends defaultCountingOutRhymer {

public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
		// TODO Auto-generated constructor stub
	}

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
			totalRejected++;
			else
				super.countIn(in);
	}
}
