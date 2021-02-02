package com.company.Helper;

import java.util.Random;

public class RandomHelper {
    private int maximum = Constants.MAXIMUM_SIZE;
    private int minimum = Constants.MINIMUM_SIZE;

    public int address() {
        return (int) ((Math.random() * (maximum - 2)) + 2);
    }

    public int size() {
        return (int) ((Math.random() * (maximum - minimum)) + minimum);
    }

    public Boolean bool() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public int time() {
        return (int) ((Math.random() * (3)) + 0);
    }

    public int randomInt(){
        return new Random().nextInt(3);
    }

    public int request() {
        return 1;
    }
}
