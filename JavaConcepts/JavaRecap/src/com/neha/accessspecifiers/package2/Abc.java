package com.neha.accessspecifiers.package2;

import com.neha.accessspecifiers.package1.AccessSpecifiersExample;

/**
 * Demonstrates access to protected members through inheritance
 * from a different package.
 */
public class Abc extends AccessSpecifiersExample{
    
    public void printDetails(){
//        show1(); // private method - not accessible even in subclass
        show2(); // public method - accessible
        show3(); // protected method - accessible through inheritance
        System.out.println(firstName); // public field - accessible
        System.out.println(lastName); // protected field - accessible through inheritance
//        System.out.println(designation); // default field - not accessible from different package
    }
}
