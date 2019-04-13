package com.example.testthread;

public abstract class Father implements Runnable {

    public abstract Integer getId();

    public abstract void runMeNow();

    @Override
    public void run() {
        while (true) {
            runMeNow();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
