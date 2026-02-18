package com.neha.generics;


class calculate<T>{
    private T a;
    private T b;

    calculate(){
        System.out.println("Default constructor");
    }
    calculate(T a, T b){
        this.a = a;
        this.b = b;
     }

     public void sum(){
        if (a instanceof Integer x && b instanceof Integer y) {
            System.out.println("Sum is :"+(x+y));
        }else {
            System.out.println("Numbers are not of type integer");
        }
     }
}

class Square{
    public <T extends Number> double areaCal(T value1, T value2){
        return value1.doubleValue() * value2.doubleValue();
    }
}

class Math<T extends Number>{
    T a;
    T b;

    public void calculation(T a,T b){
        System.out.println(" Sum is :"+(a.intValue() + b.intValue()));
    }
}

class Map<K,V>{
    private K key;
    private V value;

    public Map(K key, V value) {
        this.value = value;
        this.key = key;
    }

    public void printValues(){
        System.out.println("Key is :"+key +" Value is :"+value);
    }
}
public class GenericClassExample {
    public static void main(String[] args) {
        calculate<Integer> calc = new calculate<>(2, 3);
        calc.sum();
        calculate<String> cal = new calculate<>("b", "a");
        cal.sum();

        Square sq = new Square(); //example for methods generics
        System.out.println("area of square is :"+sq.areaCal(2,3));

        calculate c= new calculate(); //raw type in generics
        c.sum();

        Map<Integer,String> mp= new Map<>(2, "neha");
        mp.printValues();

        Math<Integer> map= new Math<>();
        map.calculation(5,6);

        //Math<String> mt= new Math<String>(); // this will give error as im using the bounds
    }
}
