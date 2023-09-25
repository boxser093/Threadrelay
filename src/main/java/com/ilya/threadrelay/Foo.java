package com.ilya.threadrelay;

import java.util.concurrent.CountDownLatch;

public class Foo {
    private CountDownLatch latch1 = new CountDownLatch(1);
    private CountDownLatch latch2 = new CountDownLatch(1);
    public void first(){
        System.out.print("first");
        latch1.countDown();
    }
    public void second() throws InterruptedException {
        latch1.await();
        System.out.print("second");
        latch2.countDown();
    }
    public void third() throws InterruptedException {
        latch1.await();
        latch2.await();
        System.out.print("third");
    }
}
