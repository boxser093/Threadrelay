package com.ilya.threadrelay;


public class ThreadA extends Thread{
    private Foo foo;
    ThreadA(Foo f) {
        foo=f;
    }

    @Override
    public void run() {
        foo.first();
    }
}
