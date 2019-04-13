package com.example.testthread;

public class Child1 extends Thread {
    ResourceLock lock;

    public Child1(ResourceLock lock){
        this.lock = lock;
    }

    @Override
    public void run() {

        try{
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    while(lock.flag!=1){
                        lock.wait();
                    }
                    System.out.print("100 ");
                    Thread.sleep(1000);
                    lock.flag = 2;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception 1 :"+e.getMessage());
        }
    }
}
