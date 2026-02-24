package com.neha.exceptions;

public class RunTimeExceptionsExm {

    public static void main(String[] args) {
//        Object i=1;
//        System.out.println((String) i); //example for ClassCastException

//        int div = 10/0;
//        System.out.println(div); //ArithmeticException

//        String s= null;
//        System.out.println(s.length()); //NullPointerException

//        int[] a = new int[2];
//        System.out.println(a[3]); //ArrayIndexOutOfBoundsException

        try{
            Object i=1;
            System.out.println((String) i);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
}
