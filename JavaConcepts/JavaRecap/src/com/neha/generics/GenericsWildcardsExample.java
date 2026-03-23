package com.neha.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WildCardGenerics{
    List<?> myList= new ArrayList<>();
    public void print(List<?> list){
        for(Object o:list){
            System.out.println(o);
        }
    }

    public double printMax(List<? extends Number> list){
        Number max=list.get(0);
        for (Number n : list){
            if(n.doubleValue() > max.doubleValue()){
                max =n;
            }
        }
        return max.doubleValue();
    }

    public void addItem(List<? super Integer> list){
        list.add(23);
        list.add(1);
        list.add(24);
        System.out.println(list);
    }
}
public class GenericsWildcardsExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("neha","zohan","safi");

        WildCardGenerics wildCardGenerics = new WildCardGenerics();
        wildCardGenerics.print(stringList);
        wildCardGenerics.print(Arrays.asList(1,2,4,6,2));
        wildCardGenerics.print(Arrays.asList(1.1,2.3,4.5));

        System.out.println(wildCardGenerics.printMax(Arrays.asList(1.1,30,4.5)));
        wildCardGenerics.addItem(List.of(9,5));
    }
}
