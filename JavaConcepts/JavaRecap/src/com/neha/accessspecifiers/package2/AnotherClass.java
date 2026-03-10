
package com.neha.accessspecifiers.package2;

import com.neha.accessspecifiers.package1.AccessSpecifiersExample;

public class AnotherClass {

    public void show(){
//        Car car = new Car(); // Car class has default access, can't be accessed from other package
        AccessSpecifiersExample accessSpecifiersExample = new AccessSpecifiersExample();
        accessSpecifiersExample.show2();
//        accessSpecifiersExample.show1(); // private method, can't access
        System.out.println(accessSpecifiersExample.firstName);
//        System.out.println(accessSpecifiersExample.lastName); // protected field, can't access from different package
//        System.out.println(accessSpecifiersExample.designation); // default field, can't access from different package
    }

    class Abc extends AccessSpecifiersExample{

        public void printDetails(){
            //            show1(); // private method - not accessible even in subclass
            show2(); // public method - accessible
            show3(); // protected method - accessible through inheritance
            System.out.println(firstName); // public field - accessible
            System.out.println(lastName); // protected field - accessible through inheritance
//            System.out.println(designation); // default field - not accessible from different package
        }
    }
}