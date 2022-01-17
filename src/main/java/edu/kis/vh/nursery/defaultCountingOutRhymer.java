package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class defaultCountingOutRhymer {

private IntArrayStack intArrayStack;

    public defaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public defaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }
}
