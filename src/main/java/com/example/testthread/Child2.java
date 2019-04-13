package com.example.testthread;

public class Child2 extends Father {

    @Override
    public Integer getId() {
        return 200;
    }

    @Override
    public void runMeNow() {
        System.out.println(getId());
    }
}
