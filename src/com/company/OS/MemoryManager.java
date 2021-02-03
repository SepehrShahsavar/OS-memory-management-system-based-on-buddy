package com.company.OS;

import com.company.Helper.Constants;
import com.company.MemmoryObj.Address;
import com.company.MemmoryObj.MemoryBlock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MemoryManager {
    private int memorySize = Constants.initialStateMemorySize;
    private ArrayList<MemoryBlock>sizeOneBlocks = new ArrayList<MemoryBlock>(); // 32
    private ArrayList<MemoryBlock> sizeTwoBlocks = new ArrayList<MemoryBlock>(); // 64
    private ArrayList<MemoryBlock> sizeThreeBlocks = new ArrayList<MemoryBlock>(); // 128
    private ArrayList<MemoryBlock> sizeFourBlocks = new ArrayList<MemoryBlock>(); // 256
    private ArrayList<MemoryBlock> sizeFiveBlocks = new ArrayList<MemoryBlock>(); // 512
    private ArrayList<MemoryBlock> sizeSixBlocks = new ArrayList<MemoryBlock>(); // 1024
    private ArrayList<MemoryBlock> biggerBlocks = new ArrayList<MemoryBlock>(); // more than 1024

    HashMap<Long , Long> addresses = new HashMap<Long, Long>();

    private final ReadWriteLock readWriteLock
            = new ReentrantReadWriteLock();
    private final Lock writeLock
            = readWriteLock.writeLock();
    private final Lock readLock = readWriteLock.readLock();

    public MemoryManager() {
        biggerBlocks.add(new MemoryBlock(0 , memorySize -1));
    }

    public Address allocate(int pid , int size){
        boolean ans = writeLock.tryLock();
        if(ans){

        }
        writeLock.unlock();
        return null ;
    }

    public void deallocate(int pid , Address address){
        boolean ans = writeLock.tryLock();
        if(ans){

        }
        writeLock.unlock();
    }

}
