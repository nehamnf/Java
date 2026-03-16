package com.neha.nestedclass;

public class Main {
    public static void main(String[] args) {
        StaticNestedInnerClass.InnerClass innerClass = new StaticNestedInnerClass.InnerClass();
        innerClass.show();
        StaticNestedInnerClass.InnerClass.staticInnerMethod();

        NonStaticInnerClass nonStaticInnerClass =  new NonStaticInnerClass();
        NonStaticInnerClass.InnerClass  innerClass1 = nonStaticInnerClass.new InnerClass();
        innerClass1.show();

        InheritanceInnerClass inheritanceInnerClass = new InheritanceInnerClass();
        inheritanceInnerClass.show();

        StaticInheritanceClass staticInheritanceClass = new StaticInheritanceClass();
        staticInheritanceClass.show();
    }
}
