package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int value) {
		if (!callCheck() && value > peekaboo()) {
			totalRejected++;
		} else {
			super.countIn(value);
		}
	}

}
