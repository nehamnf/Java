package com.neha.multithreading.locks.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();

        ReentrantLock reentrantLock = new  ReentrantLock();

        Thread t1= new Thread(() -> reentrantLockExample.produce(reentrantLock));
        Thread t2 = new Thread(() -> reentrantLockExample.produce(reentrantLock));
        t1.start();
        t2.start();
    }
}
