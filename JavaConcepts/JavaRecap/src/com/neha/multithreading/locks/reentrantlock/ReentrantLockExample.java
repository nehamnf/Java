package com.neha.multithreading.locks.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public boolean sharedValue;

    public void produce(ReentrantLock lock){

        lock.lock();
        System.out.println("Lock Acquired by Thread: "+Thread.currentThread().getName());
        sharedValue = true;
        System.out.println("Lock Released by Thread: "+Thread.currentThread().getName());
        lock.unlock();

    }
}
