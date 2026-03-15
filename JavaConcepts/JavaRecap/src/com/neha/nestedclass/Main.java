package com.neha.nestedclass;

public class Main {
    public static void main(String[] args) {
        StaticNestedInnerClass.InnerClass innerClass = new StaticNestedInnerClass.InnerClass();
        innerClass.show();
        StaticNestedInnerClass.InnerClass.staticInnerMethod();
    }
}
