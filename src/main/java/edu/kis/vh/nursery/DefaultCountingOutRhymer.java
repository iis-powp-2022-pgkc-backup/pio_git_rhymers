package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final IntArrayStack dataContainer;

    public DefaultCountingOutRhymer(IntArrayStack dataContainer) {
        this.dataContainer = dataContainer;
    }

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    public void countIn(int in) {
        dataContainer.countIn(in);
    }

    public boolean callCheck() {
        return dataContainer.callCheck();
    }

    public boolean isFull() {
        return dataContainer.isFull();
    }

    protected int peekaboo() {
        return dataContainer.peekaboo();
    }

    public int countOut() {
        return dataContainer.countOut();
    }

}
