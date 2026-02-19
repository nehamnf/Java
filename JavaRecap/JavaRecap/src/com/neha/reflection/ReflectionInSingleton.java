package com.neha.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingletonClass{
    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return INSTANCE;
    }
}

public class ReflectionInSingleton {

    public static void main(String[] args) throws NoSuchMethodException,InstantiationException ,IllegalAccessException,InvocationTargetException{
        Class<?> singletonClass = SingletonClass.class;
        Constructor<?> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(SingletonClass.getInstance());
        SingletonClass instance = (SingletonClass) constructor.newInstance();
        System.out.println(instance);
    }
}
