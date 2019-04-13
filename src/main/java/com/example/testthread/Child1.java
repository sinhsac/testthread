package com.example.testthread;

public class Child1 extends Father {


    @Override
    public Integer getId() {
        return 100;
    }

    @Override
    public void runMeNow() {
        System.out.println(getId());
    }
}
