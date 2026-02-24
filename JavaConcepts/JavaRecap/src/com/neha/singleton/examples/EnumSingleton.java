package com.neha.singleton.examples;

public class EnumSingleton {
    private EnumSingleton(){

    }

    private static enum EnumSingletonHelper{
        INSTANCE;
        private final EnumSingleton enumSingleton;
        EnumSingletonHelper(){
            enumSingleton = new EnumSingleton();
        }
    }

    private static enum EnumSingletonHelper2{
        INSTANCE;

        private static EnumSingletonHelper2 getInstance(){
            return INSTANCE;
        }

    }

    public static EnumSingleton getInstance(){
        return EnumSingletonHelper.INSTANCE.enumSingleton;
    }
}
