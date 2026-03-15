package com.neha.nestedclass;


public class StaticNestedInnerClass {
    private String instanceVariable;
    private static int classVariable;

    public static class  InnerClass{
        private String innerInstanceVariable;
        private  static String innerClassVariable ="staticVaribale";
        public void show(){
            System.out.println("Inside Inner Class Instance Method");
        }
        public static void staticInnerMethod(){
            System.out.println("Inside Inner Static Method "+innerClassVariable);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.show();
        InnerClass.staticInnerMethod();
    }
}
