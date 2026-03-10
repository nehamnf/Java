package com.neha.accessspecifiers.package1;
class Car{
    String modelName;
    private String color;
    protected String type;

    private String getModelName() {
        return modelName;
    }

    String getColor() {
        return color; // Error: Cannot access private field color
    }

    protected String getType() {
        return type;
    }
}

class Honda{
    Car car= new Car();

    public void show(){
        System.out.println(car.modelName);
        System.out.println(car.getColor());
        System.out.println(car.getType());
//        System.out.println(car.color); this will give error even if its in same dafault package

    }
}

class Mahindra extends Car{
    public void show(){
//        System.out.println(getColor()); // Error: getColor() has default access, not accessible in subclass from same package
        System.out.println(getType());
        System.out.println(modelName);
        System.out.println(type);
//        System.out.println(color); // Error: private field not accessible
//        System.out.println(getModelName()); // Error: private method not accessible
    }
}
public class AccessSpecifiersExample {
    public String firstName;
    protected String lastName;
    String designation;

    private void show1(){

    }
    public void show2(){

    }
    protected void show3(){

    }

    public static void main(String[] args) {

    }
}
