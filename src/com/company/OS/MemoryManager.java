package com.company.OS;

import com.company.Helper.Constants;
import com.company.MemmoryObj.Address;
import com.company.MemmoryObj.MemoryBlock;

import java.util.ArrayList;

public class MemoryManager {
    private int MemorySize = Constants.initialStateMemorySize;
    private ArrayList<MemoryBlock>sizeOneBlocks = new ArrayList<MemoryBlock>(); // 32
    private ArrayList<MemoryBlock> sizeTwoBlocks = new ArrayList<MemoryBlock>(); // 64
    private ArrayList<MemoryBlock> sizeThreeBlocks = new ArrayList<MemoryBlock>(); // 128
    private ArrayList<MemoryBlock> sizeFourBlocks = new ArrayList<MemoryBlock>(); // 256
    private ArrayList<MemoryBlock> sizeFiveBlocks = new ArrayList<MemoryBlock>(); // 512
    private ArrayList<MemoryBlock> sizeSixBlocks = new ArrayList<MemoryBlock>(); // 1024
    private ArrayList<MemoryBlock> biggerBlocks = new ArrayList<MemoryBlock>(); // more than 1024


    public Address allocate(int pid , int size){

    }

    public void deallocate(int pid , Address address){

    }

}
