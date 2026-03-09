package com.neha.multithreading.locks.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer(5);
        StampedLock stampedLock = new StampedLock();

        Thread t1 = new Thread(()->{
            producerConsumer.producer(5,stampedLock);
        });

        Thread t2 = new Thread(()->{
            producerConsumer.producer(6,stampedLock);
        });

        Thread t3 = new Thread(() -> producerConsumer.consumer(stampedLock));
        Thread t4 = new Thread(() -> producerConsumer.consumer(stampedLock));

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


        ProducerConsumerExm2 producerConsumerExm2 = new ProducerConsumerExm2();
        Thread thread1 = new Thread(() -> producerConsumerExm2.producer(stampedLock));
        Thread thread2 = new Thread(() -> producerConsumerExm2.consumer(stampedLock));
        thread1.start();
        thread2.start();
    }
}
