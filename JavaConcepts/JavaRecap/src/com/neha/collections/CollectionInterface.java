package com.neha.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Number> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        System.out.println(collection);

        Collection<Float> collection1 = new ArrayList<>();
        collection1.add(6.7f);
        collection1.add(10.8f);

        System.out.println(collection1);

        Collection<Number> collection3 = new ArrayList<>();
        collection3.add(1);
        collection3.add(2);
        collection3.add(3);

        System.out.println("Equals: "+collection.equals(collection3));

        collection.addAll(collection1);

        System.out.println(collection);

        System.out.println(collection.contains(3));

        collection.removeIf( n -> (n.intValue() % 2) == 0);

        System.out.println(collection);

        collection.remove(1);

        System.out.println(collection);

        collection.addAll(collection1);
        System.out.println(collection);

        Iterator<Number> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterator: "+iterator.next());
        }

    }
}
