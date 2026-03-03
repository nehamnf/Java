package com.neha.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerMultiThreading {
    public Queue<Integer> bufferQueue ;
    public int bufferSize;

    public ProducerConsumerMultiThreading(int bufferSize){
        this.bufferQueue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void producer(int item){

        while(bufferQueue.size() == bufferSize){
            System.out.println("Producer is Full waiting for consumer to consumer");
           try{
               wait();
           }catch (InterruptedException e){
               System.out.println(e.getMessage());
           }
        }
        bufferQueue.add(item);
        System.out.println("Produced :"+item);
        notify();
    }

    public synchronized void consumer(){

        while(bufferQueue.isEmpty()){
            System.out.println("Waiting for Producer to produce");
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        Integer item= bufferQueue.poll();
        System.out.println("Consumed: "+item);
        notify();
    }
}
