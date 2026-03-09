package com.neha.multithreading.locks.stampedlock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class ProducerConsumer {
    public Queue<Integer> bufferQueue ;
    public int bufferSize;

    public ProducerConsumer(int bufferSize){
        this.bufferQueue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public void producer(int item, StampedLock stampedLock){
        long stamp = stampedLock.readLock();
        System.out.println("Producer stamp: "+stamp);
       try{
            System.out.println("Read lock acquired by Thread: "+Thread.currentThread().getName());
            while(bufferQueue.size() == bufferSize){
                System.out.println("Producer is Full waiting for consumer to consumer");
             }
            bufferQueue.add(item);
            System.out.println("Produced :"+item);
       }finally {
           System.out.println("Read lock released by Thread: " + Thread.currentThread().getName());
           stampedLock.unlockRead(stamp);
       }
    }

    public void consumer(StampedLock stampedLock){
        long stamp = stampedLock.writeLock();
        System.out.println("Consumer stamp: "+stamp);
        try {
            System.out.println("Write lock acquired by Thread: " + Thread.currentThread().getName());
            while (bufferQueue.isEmpty()) {
                System.out.println("Waiting for Producer to produce");

            }
            Integer item = bufferQueue.poll();
            System.out.println("Consumed: " + item);
        }finally {
            System.out.println("Write lock released by Thread: " + Thread.currentThread().getName());
            stampedLock.unlockWrite(stamp);
        }
    }
}
