package com.ilya.threadrelay;


public class AppRunner {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new ThreadB(foo).start();
        new ThreadC(foo).start();
        new ThreadA(foo).start();

    }

}
