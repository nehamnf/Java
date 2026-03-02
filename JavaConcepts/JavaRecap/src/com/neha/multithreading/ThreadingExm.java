package com.neha.multithreading;

public class ThreadingExm {

    public static void main(String[] args) {


        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("This is inside Runnable Thread: "+Thread.currentThread().getName());
            }
        });
        t.start();
        System.out.println("Thread Name: "+Thread.currentThread().getName());

        Thread s= new Thread() {
            @Override
            public void run() {
                System.out.println("Current Thread Name: "+Thread.currentThread().getName());
            }
        };
        s.start();
    }
}
