package com.neha.nestedclass;

//nonStaticInnerClass Inheritance
public class InheritanceInnerClass extends NonStaticInnerClass.InnerClass{

    InheritanceInnerClass(){
        new NonStaticInnerClass().super();
    }

    @Override
    public void show() {
        super.show();
    }
}

class StaticInheritanceClass extends StaticNestedInnerClass.InnerClass{

    @Override
    public void show() {
        super.show();
        System.out.println("Overridden show Method in the extended StaticInheritanceClass");
    }
}