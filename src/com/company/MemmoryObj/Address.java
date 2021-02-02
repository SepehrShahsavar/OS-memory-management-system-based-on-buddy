package com.company.MemmoryObj;

public class Address {
    private long base ;
    private long size ;

    public Address(long base, long size) {
        this.base = base;
        this.size = size;
    }

    public long getBase() {
        return base;
    }

    public long getSize() {
        return size;
    }
}
