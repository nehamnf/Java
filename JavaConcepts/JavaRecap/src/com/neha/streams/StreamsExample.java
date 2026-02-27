package com.neha.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamsExample {
    public static void main(String[] args) {

        //from collection
        List<Integer> list= Arrays.asList(1000,200,300);
        Stream<Integer> stream = list.stream();

        //from arrays
        Integer[] integers= new Integer[]{1,2,3};
        Stream<Integer> stream1 = Arrays.stream(integers);

        //from static method
        Stream<Integer> integerStream= Stream.of(10,20,30);

        //from stream builder
        Stream.Builder<Integer>  sb= Stream.builder();
        sb.add(1).add(2).add(3);
        Stream<Integer> integerStream1 = sb.build();

        //from stream iterate
        Stream<Integer> st = Stream.iterate(0,i->i+1).limit(10);

        //filter
        Stream<String> stringList = Stream.of("Hello","neha","how","are","you","doing");
        Stream<String> filteredStream = stringList.filter(s -> s.length()>3);
        List<String> result = filteredStream.toList();
        System.out.println(result);
        System.out.println(Stream.of("Hello","neha","how","are","you","doing").filter((s) -> s.length() > 4).toList());

        //map
        Stream<String> s = Stream.of("Hello","neha","how","are","you","doing");
        List<String> ft = s.map((str    ) -> str.toUpperCase() ).toList();
        System.out.println(ft);

        //flatMap
        List<List<String>> doubleList = Arrays.asList(
                Arrays.asList("hello"),
                Arrays.asList("neha"),
                Arrays.asList("how"),
                Arrays.asList("r"),
                Arrays.asList("u")
        );

        List<String> flattenedList = doubleList.stream().flatMap((List<String> list1) -> list1.stream().map(str->str.toUpperCase())).toList();
        System.out.println(flattenedList);

        //distinct
        Integer[] integers1= new Integer[]{1,2,3,4,5,6,6,6,4,5,8,6,9,7};
        Stream<Integer> disExample = Arrays.stream(integers1).distinct();
        List<Integer>  disList = disExample.toList();
        System.out.println(disList);

        //sorted
        Stream<Integer> sortExample = Arrays.stream(integers1).sorted((a,b)-> b-a).distinct();
        List<Integer> sortedList = sortExample.toList();
        System.out.println(sortedList);

        //peek //limit
        Stream<String > peekStream = Stream.of("neha","how","r","u").peek((val)-> System.out.println(val)).limit(3).skip(1);
        System.out.println(Arrays.toString(peekStream.toArray()));

        //mapToInt
        List<Integer> list1 = Arrays.asList(1,2,3,4,4);
        IntStream intStream= list1.stream().mapToInt(Integer::valueOf);
        System.out.println(Arrays.toString(intStream.peek(in -> System.out.println(in)).toArray()));

        //Terminal operations
        //foreach
        Stream.of(1,2,3,4).forEach((v) -> System.out.println(v));

        //toArray
        Integer[] intArray = Stream.of(1,2,3,4).toArray((size)-> new Integer[size]);

        //reduce
        Optional<Integer> stream2 = Stream.of(2,4,6,1).filter((g) -> g > 2).reduce((y,x) -> y *2);
        System.out.println(stream2.get());
    }
}
