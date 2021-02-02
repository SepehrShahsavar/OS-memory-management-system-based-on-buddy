package com.company.MemmoryObj;

public class MemoryBlock {
    private long start;
    private long finish;
    private boolean state; // false means it's free

    public MemoryBlock(int start, int finish) {
        this.start = start;
        this.finish = finish;
        state = false;
    }

    public long getStart() {
        return start;
    }

    public long getFinish() {
        return finish;
    }
    
    public boolean isFree() {
        return state;
    }
}
