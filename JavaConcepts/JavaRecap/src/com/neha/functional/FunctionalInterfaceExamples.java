package com.neha.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * This class demonstrates the usage of built-in functional interfaces in Java 8+
 * Functional interfaces provide target types for lambda expressions and method references.
 * The main built-in functional interfaces are:
 * - Consumer: Represents an operation that accepts a single input argument and returns no result
 * - Supplier: Represents a supplier of results
 * - Function: Represents a function that accepts one argument and produces a result
 * - Predicate: Represents a predicate (boolean-valued function) of one argument
 */
//normal implementaion of functional iterface
class cons  implements Consumer<String>{
    /**
     * Custom implementation of Consumer interface
     * @param s the input string to be processed and printed
     */
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

/**
 * Main class demonstrating various functional interface implementations
 * including lambda expressions, anonymous classes, and traditional implementations
 */
public class FunctionalInterfaceExamples {

    /**
     * Main method demonstrating various functional interface implementations
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //lambda implementation of interface
        // Consumer accepts a parameter and performs an action, returns void
        Consumer<String> consumer = (String name)->{
            System.out.println(name+" This is Consumer Functional interface Lambda implementation");
        };
        consumer.accept("Hello");

        //anonymous implementation
        // Traditional anonymous class implementation of Consumer
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                // Empty implementation - could add logic here
            }
        };

        // Supplier example using lambda expression
        // Supplier takes no parameters but returns a value
        Supplier<String> supplier= ()->{
            return "This is supplier functional interface example";
        };
        System.out.println(supplier.get());

        // Function example using lambda expression
        // Function takes one parameter and returns a result
        Function<String,Integer> function = (String name)->{
            if (name.equals("neha")){
                return 1;
            }
            return 0;
        };
        System.out.println(function.apply("neha"));

        // Predicate example using lambda expression
        // Predicate takes one parameter and returns a boolean
        Predicate<Integer> predicate = i -> i % 2 == 0;
        // Note: should use predicate.test(4) instead of predicate.equals(4) for proper usage
        System.out.println(predicate.equals(4));
    }
}
