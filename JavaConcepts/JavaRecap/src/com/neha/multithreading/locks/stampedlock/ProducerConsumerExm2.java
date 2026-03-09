package com.neha.multithreading.locks.stampedlock;
import java.util.concurrent.locks.StampedLock;

public class ProducerConsumerExm2 {
    public int sharedValue;
    public void producer(StampedLock stampedLock){
        long stamp = stampedLock.tryOptimisticRead();
        System.out.println("Producer stamp: "+stamp);
        try{
            System.out.println("Read lock acquired by Thread: "+Thread.currentThread().getName());
            sharedValue = 10;
            Thread.sleep(10000);
            if(stampedLock.validate(stamp)){
                System.out.println("Value has been updated");
            }else{
                System.out.println("Before Rollback the changes: "+sharedValue);
                sharedValue =10;
                System.out.println("Rollback the changes: "+sharedValue);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void consumer(StampedLock stampedLock){
        long stamp = stampedLock.writeLock();
        System.out.println("Consumer stamp: "+stamp);
        try {
            System.out.println("Write lock ACQUIRED by Thread: " + Thread.currentThread().getName());
            sharedValue = 15;
        }finally {
            System.out.println("Write lock RELEASED by Thread: "+Thread.currentThread().getName());
            stampedLock.unlockWrite(stamp);
        }
    }
}
