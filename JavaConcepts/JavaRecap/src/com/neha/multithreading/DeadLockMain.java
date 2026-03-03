package com.neha.multithreading;

public class DeadLockMain {
    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();

        Thread t1 = new Thread(() ->{
            System.out.println("Thread1 calling");
           deadLockExample.produce();
        });

        Thread t2 = new Thread(() ->{
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            System.out.println("Thread2 calling");
           deadLockExample.produce();
        });
        t1.setDaemon(true);

        t1.start();
//        t2.start();
        // Modern alternative to suspend(): use proper synchronization
//        try {
//            Thread.sleep(8000); // Let t1 wait before continuing
//            System.out.println("Thread1 Resumed");
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }

//        try{
//            System.out.println("Waiting for Thread1 and Thread2 to completed before finishing main ");
//            t1.join();
//            t2.join();
//        }catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }
        System.out.println("Main Thread Finished");
    }
}
