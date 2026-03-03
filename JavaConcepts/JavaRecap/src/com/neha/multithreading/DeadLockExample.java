package com.neha.multithreading;

public class DeadLockExample {
    public boolean sharedValue;

    public synchronized void produce(){
        System.out.println("Lock Acquired");
        sharedValue = true;
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Lock Released");
    }
}
