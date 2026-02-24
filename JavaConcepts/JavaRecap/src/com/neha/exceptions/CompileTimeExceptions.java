package com.neha.exceptions;

public class CompileTimeExceptions {

    public static void method1() throws ClassNotFoundException{
        method2();
    }

    public static void method2() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
    public static void main(String[] args) {
       try {
           method1();
       }catch (ClassNotFoundException e){
           System.out.println(e.getMessage());
       }
    }
}
