package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbersArray = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbersArray[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbersArray[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbersArray[total--];
    }

}
// Polecenia alt + -> to skrót forward/back
