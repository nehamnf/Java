package com.neha.multithreading;

public class SharedResource {

    boolean isItemPresent=false;

    public synchronized void addItem(){
        while(isItemPresent){
            try {
                System.out.println("Produce Thread is waiting");
                wait();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        isItemPresent=true;
        System.out.println("add Item: "+isItemPresent);
        System.out.println("Producer calling notifyAll method");
        notifyAll();
    }

    public synchronized void consumeItem(){
        while(!isItemPresent){
            try {
                System.out.println("Consumer Thread is Waiting");
                wait();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        isItemPresent=false;
        System.out.println("Consume Item: "+isItemPresent);
        System.out.println("Consumer calling notify all Method");
        notifyAll();
    }
}
