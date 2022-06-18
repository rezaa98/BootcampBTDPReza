package com.learning.belajarLagi;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWorld extends Thread {
    private String name = "";

    public ThreadWorld() {
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(getName() + ": World");
        try {
            Thread.sleep(250);
        } catch (Exception e) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}