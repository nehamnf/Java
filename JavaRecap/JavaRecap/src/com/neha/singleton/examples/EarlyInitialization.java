package com.neha.singleton.examples;

public class EarlyInitialization {
    private static final EarlyInitialization instance = new EarlyInitialization();

    private EarlyInitialization() {

    }

    public static EarlyInitialization getInstance() {
        return instance;
    }
}
