package com.neha.multithreading;

public class Main {

    public static void main(String[] args) {
        MonitorClassExample monitorClassExample = new MonitorClassExample();

        Thread thread1= new Thread(()-> monitorClassExample.task1());
        Thread thread2= new Thread(()-> monitorClassExample.task2());
        Thread thread3= new Thread(()-> monitorClassExample.task3());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
