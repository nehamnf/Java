package com.neha.multithreading.locks.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer= new ProducerConsumer(5);
        ReadWriteLock readWriteLock= new ReentrantReadWriteLock();

        Thread t1 = new Thread(()->{
           producerConsumer.producer(5,readWriteLock);
        });

        Thread t2 = new Thread(()->{
            producerConsumer.producer(6,readWriteLock);
        });

        Thread t3 = new Thread(() -> producerConsumer.consumer(readWriteLock));
        Thread t4 = new Thread(() -> producerConsumer.consumer(readWriteLock));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
