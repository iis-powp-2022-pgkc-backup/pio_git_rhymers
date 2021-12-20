package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	private static final String STRING = "  ";
	private static final int _20 = 20;
	private static final int _3 = 3;
	private static final int _15 = 15;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};
		
		for (int i = 1; i < _15; i++)
			for (int j = 0; j < _3; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < _15; i++)
			rhymers[_3].countIn(rn.nextInt(_20));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + STRING);
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[_3]).reportRejected());
		
	}
	
}