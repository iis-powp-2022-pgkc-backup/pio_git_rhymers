package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntArrayStackInterface {
    private static final int _12 = 12;


    private static final int DEFAULT_VALUE = 0;
    /**
     *
     */
    static final int EMPTY = 0;

    private final int[] NUMBERS = new int[_12];

    public int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }
}
