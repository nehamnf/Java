package com.neha.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {
        Consumer<String> consumer = (String name)->{
            System.out.println(name+" This is Consumer Functional interface Lambda implementation");
        };
        consumer.accept("Hello");

        Supplier<String> supplier= ()->{
            return "This is supplier functional interface example";
        };
        System.out.println(supplier.get());

        Function<String,Integer> function = (String name)->{
            if (name.equals("neha")){
                return 1;
            }
            return 0;
        };
        System.out.println(function.apply("neha"));

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.equals(4));
    }
}
