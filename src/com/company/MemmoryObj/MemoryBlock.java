package com.company.MemmoryObj;

public class MemoryBlock {
    private long start;
    private long finish;
    private boolean isFree; // false means it's free
    private int pid;

    public MemoryBlock(int start, int finish) {
        this.start = start;
        this.finish = finish;
        isFree = true;
    }

    public long getStart() {
        return start;
    }

    public long getFinish() {
        return finish;
    }

    public boolean isFree() {
        return isFree;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
