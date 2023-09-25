package com.ilya.threadrelay;

class ThreadB extends Thread {
    private Foo foo;
    ThreadB(Foo f) {
        foo=f;
    }

    @Override
    public void run() {
        try {
            foo.second();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
