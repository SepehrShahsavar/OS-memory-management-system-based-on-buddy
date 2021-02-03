package com.company.MemmoryObj;

import com.company.Helper.RandomHelper;
import com.company.OS.MemoryManager;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.graalvm.compiler.nodes.cfg.Block;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Process implements Runnable{
    private int PID;
    private ArrayList<Address> Address;
    private long allocatedSpace;
    private MemoryManager memoryManager;
    private int sleepTime;

    public Process(int PID, MemoryManager memoryManager , int sleepTime) {
        this.PID = PID;
        this.memoryManager = memoryManager;
        allocatedSpace = 0;
        this.sleepTime = sleepTime;
        Address = new ArrayList<com.company.MemmoryObj.Address>();
    }

    @Override
    public void run(){
        RandomHelper rnd = new RandomHelper();
        if(allocatedSpace == 0){
            try {
                Thread.sleep(sleepTime * 1000);
                Address.add(allocate(PID , rnd.size()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
                int random = rnd.randomInt();
            try {
                Thread.sleep(sleepTime * 1000);
                if(random % 2 == 0 ){

                    Address.add(allocate(PID , rnd.size()));
                }else {
                    Address add = Address.get(Address.size() - 1);
                    deallocate(PID , add);
                    Address.remove(Address.size() -1 );
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Address allocate(int pid , int size){
        return memoryManager.allocate(pid , size);
    }

    private void deallocate(int pid , Address address){
        memoryManager.deallocate(pid , address);
    }
}
