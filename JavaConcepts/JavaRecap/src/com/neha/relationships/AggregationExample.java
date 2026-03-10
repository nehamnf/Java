package com.neha.relationships;

public class AggregationExample {

    public static void main(String[] args) {

        Engine petrolEngine = new Engine("Petrol");

        Car bmw = new Car("BMW", petrolEngine);

        bmw.printCarDetails();

        System.out.println(bmw);
    }
}

class Car {

    private final String name;
    private final Engine engine;

    public Car(String name, Engine engine) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Car name cannot be null or empty");
        }
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }

        this.name = name;
        this.engine = engine;
    }

    public void printCarDetails() {
        System.out.println(name + " uses a " + engine.getType() + " engine");
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}

class Engine {

    private final String type;

    public Engine(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Engine type cannot be null or empty");
        }
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}