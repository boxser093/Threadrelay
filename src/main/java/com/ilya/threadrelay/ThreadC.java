package com.ilya.threadrelay;

class ThreadC extends Thread {
    private Foo foo;
    ThreadC(Foo f) {
        foo=f;
    }

    @Override
    public void run() {
        try {
            foo.third();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
