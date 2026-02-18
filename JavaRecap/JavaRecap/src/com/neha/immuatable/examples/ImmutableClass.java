package com.neha.immuatable.examples;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class PetNames {
    private final String name;
    private final String color;
    private final int age;

    public PetNames(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetNames petNames = (PetNames) o;
        return age == petNames.age &&
               Objects.equals(name, petNames.name) &&
               Objects.equals(color, petNames.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    @Override
    public String toString() {
        return "PetNames{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", age=" + age +
               '}';
    }
}
public final class ImmutableClass {
    private final String name;
    private final List<PetNames> petNames;

    public ImmutableClass(String name, List<PetNames> petNames) {
        this.name = name;
        this.petNames = new ArrayList<>(petNames);  // Defensive copy
    }

    public String getName() {
        return name;
    }

    public List<PetNames> getPetNames() {
        return new ArrayList<>(petNames); // Defensive copy to maintain immutability
    }
    
    @Override
    public String toString() {
        return "ImmutableClass{" +
               "name='" + name + '\'' +
               ", petNames=" + petNames +
               '}';
    }

}
