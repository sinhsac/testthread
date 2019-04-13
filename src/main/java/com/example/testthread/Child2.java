package com.example.testthread;

public class Child2 extends Thread {
    ResourceLock lock;
    public Child2(ResourceLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    while(lock.flag!=2){
                        lock.wait();
                    }
                    System.out.print("200 ");
                    Thread.sleep(1000);
                    lock.flag = 1;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception 2 :"+e.getMessage());
        }

    }
}
