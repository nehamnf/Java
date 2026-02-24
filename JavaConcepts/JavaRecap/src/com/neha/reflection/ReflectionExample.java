package com.neha.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

class Bird{
    public String name;
    private int age;

    public Bird(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printBirdName(){
        System.out.println("Bird name is :"+this.name);
    }

    private void printBirdAge(){
        System.out.println("Bird Age is :"+this.age);
    }
}
public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        Class<?> bird = Class.forName("com.neha.reflection.Bird");
        System.out.println(Arrays.toString(bird.getConstructors()));
        for(var methods :bird.getDeclaredMethods()){
            System.out.println(methods);
        }

        for (var fields : bird.getDeclaredFields()){
            System.out.println(fields);
        }

        Field field = bird.getDeclaredField("age");
        System.out.println("Successfully accessed field: " + field.getName());
        field.setAccessible(true);
        Bird birdInstance = new Bird(5, "Sparrow");
        field.set(birdInstance, 3);
        System.out.println("Set age field to: " + field.get(birdInstance));

    }
}
