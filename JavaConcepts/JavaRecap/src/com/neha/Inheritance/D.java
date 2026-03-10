package com.neha.Inheritance;

//public class D extends B,C { //this wwill give error
//}
interface Parent1{
    public abstract void show();
}

interface Parent2{
    public abstract void show();
}

public class D implements Parent1,Parent2{
    @Override
    public void show() {
        System.out.println("Class D");
    }

    public static void main(String[] args) {
        Parent1 parent1=new D();
        parent1.show();

        Parent2 parent2 = new D();
        parent2.show();

        D d= new D();
        d.show();
    }
}