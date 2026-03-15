package com.neha.multithreading.executor;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
        ThreadFactory th = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setPriority(Thread.NORM_PRIORITY);
                t.setDaemon(false);
                return t;
            }
        };
        ThreadFactory threadFactory = (Runnable r) -> {
            Thread t = new Thread(r);
            t.setPriority(Thread.NORM_PRIORITY);
            return t;
        };

        RejectedExecutionHandler rejectedExecutionHandler = (r,t) ->{
            System.out.println("Rejected task is: "+r.toString());
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), th,rejectedExecutionHandler);
            for(int i=0;i < 7;i++){
                threadPoolExecutor.execute(()->{
                    try{
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Task is executed inside threadpool by "+Thread.currentThread().getName());
                });
            }
            threadPoolExecutor.shutdown();
    }
}
