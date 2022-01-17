package edu.kis.vh.nursery.list;

public class IntArrayStack {
    private static final int _12 = 12;

    private static final int EMPTY_RHYMER_INDICATOR = -1;

    private static final int DEFAULT_VALUE = -1;

    private final int[] NUMBERS = new int[_12];

    public int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total--];
    }
}
