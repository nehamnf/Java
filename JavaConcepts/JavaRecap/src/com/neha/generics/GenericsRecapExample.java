package com.neha.generics;

import java.util.ArrayList;
import java.util.List;

class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key,V value) {
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

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

    public <K,V> String pairToString(K k,V v){
        return k+" "+v;
    }

    public static void main(String[] args) {
        GenericsRecapExample<String> list =  new GenericsRecapExample<>();
        list.addNames("neha");
        list.addNames("zohan");
        list.printDetails();
        String choice = list.<String>pickFirst("neha","zohan",false);

        Pair<String, Integer> pair= new Pair<>("neha",100);
        System.out.println(pair.getKey());

        System.out.println(list.pairToString("neha",20));
    }
}


