package com.neha.nestedclass;

public class NonStaticInnerClass {
    private String instanceVariable;
    private String staticInstanceVaribale;

    public class InnerClass{
        private String innerInstanceVarible;
        private String staticInnerVaribale;

        public void show(){
            System.out.println("Inside Non Static Inner class ");
        }
    }

    public static void main(String[] args) {
        NonStaticInnerClass nonStaticInnerClass = new NonStaticInnerClass();
        InnerClass innerClass = nonStaticInnerClass.new InnerClass();
        innerClass.show();

    }
}
