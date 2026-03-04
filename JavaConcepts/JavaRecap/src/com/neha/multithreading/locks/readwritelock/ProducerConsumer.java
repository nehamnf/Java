package com.neha.multithreading.locks.readwritelock;

import com.neha.multithreading.locks.reentrantlock.ReentrantLockExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReadWriteLock;

public class ProducerConsumer {public Queue<Integer> bufferQueue ;
    public int bufferSize;

    public ProducerConsumer(int bufferSize){
        this.bufferQueue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public void producer(int item, ReadWriteLock readWriteLock){
        readWriteLock.readLock().lock();
        System.out.println("Read lock acquired by Thread: "+Thread.currentThread().getName());
        while(bufferQueue.size() == bufferSize){
            System.out.println("Producer is Full waiting for consumer to consumer");
        }
        bufferQueue.add(item);
        System.out.println("Produced :"+item);
        System.out.println("Read lock released by Thread: "+Thread.currentThread().getName());
        readWriteLock.readLock().unlock();

    }

    public void consumer(ReadWriteLock readWriteLock){
        readWriteLock.writeLock().lock();
        System.out.println("Write lock acquired by Thread: "+Thread.currentThread().getName());
        while(bufferQueue.isEmpty()){
            System.out.println("Waiting for Producer to produce");

        }
        Integer item= bufferQueue.poll();
        System.out.println("Consumed: "+item);
        System.out.println("Write lock released by Thread: "+Thread.currentThread().getName());
        readWriteLock.writeLock().unlock();
    }
}
