package com.neha.singleton.examples;

public enum EnumSingletonExample {
    INSTANCE;

    private EnumSingletonExample() {
    }
    
    public static EnumSingletonExample getInstance() {
        return INSTANCE;
    }
}
