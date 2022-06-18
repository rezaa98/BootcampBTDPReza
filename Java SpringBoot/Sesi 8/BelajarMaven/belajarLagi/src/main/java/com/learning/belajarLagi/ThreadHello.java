package com.learning.belajarLagi;

import java.util.logging.Logger;
import java.util.logging.Level;

public class ThreadHello implements Runnable {
    private String name = "";
	
	public ThreadHello(String name) {
		this.name = name;
	}
	
    @Override
	public void run() {
		System.out.println(name + ": Hello!");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
}