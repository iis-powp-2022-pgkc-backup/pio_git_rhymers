package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntArrayStackInterface {
	private static final int MAX_STACK = 11;


    private static final int IF_EMPTY = 0;

    static final int EMPTY = 0;

    private final int[] NUMBERS = new int[MAX_STACK+1];

    public int total = IF_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == MAX_STACK;
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
