package com.learning.belajarLagi;

import java.util.Random;

public class NumberGenerator {
    
    private int low;
    private int high;

    public NumberGenerator(int low, int high){
        this.low = low;
        this.high = high;
    }

    public int randomNumber() {
        Random r = new Random();
        int result = r.nextInt(high - low) + low;
        return result;
    }
}