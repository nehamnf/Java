package com.neha.nestedclass;

class Car{
    private String name;

    public void printDetails(){
        System.out.println("Inside Car method");
    }

    public void carMethod(){
        System.out.println("This is the method that belongs to only car");
    }
}

class Mahindra extends Car{
    @Override
    public void printDetails() {
        System.out.println("Inside the Over ridden Mahindra Class");
    }

    public void mahindraMethod(){
        System.out.println("Method inside the Mahindra Class");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Car i20 = new Car(){
            @Override
            public void printDetails() {
                System.out.println("Inside the i20 Car details");
            }

            public void show(){
                System.out.println("This is the method inside the anonymous class");
            }
        };

        i20.carMethod();
        i20.printDetails();

        Car mahindra = new Mahindra();
        mahindra.printDetails();
        mahindra.carMethod();

        Mahindra mahindra1 = new Mahindra();
        mahindra1.mahindraMethod();;
        mahindra1.carMethod();
        mahindra1.printDetails();
    }
}
