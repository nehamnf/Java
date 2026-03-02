package com.neha.multithreading;

public class MonitorClassExample {

    public synchronized void task1(){

        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Task1 after thread sleep");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void task2(){
        System.out.println("This is task2 before synchronized");
        synchronized (this){
            System.out.println("This is task2 after synchronized");
        }
    }

    public  void task3(){
        System.out.println("This is task3");
    }
}
