package com.neha.multithreading;

public class ShareResourseMain {
    public static void main(String[] args) {
        SharedResource sharedResource= new SharedResource();
        ProducerConsumerMultiThreading producerConsumerMultiThreading = new ProducerConsumerMultiThreading(5);

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(10000);
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
                for(int i = 0; i < 3; i++) {
                    sharedResource.addItem();
                }
//                sharedResource.addItem();
            }
        });

        Thread consumerThread = new Thread(()->{
//            try {
//                Thread.sleep(60000);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//           sharedResource.consumeItem();
            for(int i = 0; i < 3; i++) {
                sharedResource.consumeItem();
            }
        });

//        producerThread.start();
//        consumerThread.start();

        Thread producer = new Thread(() ->{
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            for(int i =1; i<= 10;i++) {
                producerConsumerMultiThreading.producer(i);
            }
        });

        Thread consumer = new Thread(() ->{
            for(int i =1; i<= 5;i++) {
                producerConsumerMultiThreading.consumer();
            }
        });

        producer.start();
        consumer.start();

    }
}
