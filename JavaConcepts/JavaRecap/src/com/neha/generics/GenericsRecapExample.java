package com.neha.generics;

import java.util.ArrayList;
import java.util.List;

//Generic Class Example
public class GenericsRecapExample<T> {
    private List<T> names = new ArrayList<>();

    public void addNames(T name){
        this.names.add(name);
    }

    public void printDetails(){
        System.out.println(names);
    }

    //generic Method Example
    public <U> U pickFirst(U a,U b,boolean choice){
        return choice ? a:b;
    }

    public static void main(String[] args) {
        GenericsRecapExample<String> list =  new GenericsRecapExample<>();
        list.addNames("neha");
        list.addNames("zohan");
        list.printDetails();
        String choice = list.<String>pickFirst("neha","zohan",false);
    }
}


