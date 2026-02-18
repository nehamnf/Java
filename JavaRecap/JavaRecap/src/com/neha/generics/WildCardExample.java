package com.neha.generics;


import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private String name;
    private String color;

    public Vehicle(){

    }
    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void print(List<? extends Vehicle> vh){
//        vh.add(new Vehicle());
        System.out.println(vh.get(0));
        for(Vehicle v : vh){
            System.out.println(v);
        }
    }

    public <T extends Bus> void printValue(List<T> list){
        for( T v : list){
            System.out.println("From printValue Method : "+v);
        }
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}'+" Class name :"+getClass().getName();
    }
}

class Bus extends Vehicle{

    public Bus() {
        super();
    }

    public Bus(String name, String color) {
        super(name, color);
    }
}

class Auto extends Vehicle{
    public Auto(String name, String color) {
        super(name, color);
    }
}

public class WildCardExample {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();

        List<Vehicle> v = new ArrayList<>();
        v.add(new Vehicle());
        v.add(new Bus());
        v.add(new Auto("bajaj","black"));
        vh.print(v);

        List<Auto> auto= new ArrayList<>();
        auto.add(new Auto("bajaj","pink"));
        auto.add(new Auto("bajaj","green"));
        vh.print(auto);

        List<Bus> b= new ArrayList<>();
        b.add(new Bus());
        vh.printValue(b);
    }
}
