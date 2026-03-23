package com.neha.generics;


import java.util.Comparator;
import java.util.List;

class BoundExample{
    public <T extends Number> Integer sum(T a, T b){
        return a.intValue()+b.intValue();
    }

    public <T extends  Number> int sum(List<T> list){
        int sum=0;
        for (T i:list){
            sum = sum +i.intValue();
        }
        return sum;
    }

    public <T extends  Number & Comparable<T>> T findMax(List<T> list){
        T max= list.get(0);
        for (T value:list){
            if(value.compareTo(max)>0){
                max=value;
            }
        }
        return max;
    }
}
public class GenericBoundExamples {
    public static void main(String[] args) {
        BoundExample boundExample = new BoundExample();
        System.out.println(boundExample.sum(20.0,30.0));

        System.out.println(boundExample.sum(List.of(2,3,4,5,6,7,8,9,10)));

        System.out.println(boundExample.findMax(List.of(2,3,40,5,6,7,8,9,10)));
    }
}
