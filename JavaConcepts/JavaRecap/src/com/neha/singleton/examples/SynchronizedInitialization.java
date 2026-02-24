package com.neha.singleton.examples;

public class SynchronizedInitialization {
    private static volatile SynchronizedInitialization synchronizedInitialization;

    private SynchronizedInitialization(){

    }

    public static SynchronizedInitialization getInstance(){
        if (synchronizedInitialization == null){
            synchronized (SynchronizedInitialization.class){
                if (synchronizedInitialization == null){
                    synchronizedInitialization = new SynchronizedInitialization();
                }
            }
        }
        return synchronizedInitialization;
    }

}
