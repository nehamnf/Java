package com.neha.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Arrays;

// CORRECT: @Target is used when defining custom annotations
@Target(ElementType.METHOD)  // This annotation can only be applied to methods
@Retention(RetentionPolicy.RUNTIME)  // Make it available at runtime
@interface MyCustomAnnotation {
    String description() default "";
}

// Another example: annotation that can be applied to fields and methods
@Target({ElementType.FIELD, ElementType.METHOD})
@interface AnotherAnnotation {
    String description();
}

class Home{

    @MyCustomAnnotation
    @Override
    public String toString() {
        return "Home";
    }
}

public class AnnotationsExample {
    
    // CORRECT: Using the custom annotation on a method (as defined by @Target)
    @MyCustomAnnotation
    public void annotatedMethod() {
        System.out.println("This method has a custom annotation");
    }
    
    // This would cause a compile error because @MyCustomAnnotation only targets methods
    // @MyCustomAnnotation("Cannot annotate fields")
    // private String field;
    
    // CORRECT: Using @AnotherAnnotation on a field
    @AnotherAnnotation(description = "This field is annotated")
    private String annotatedField = "Hello";
    
    // CORRECT: Using @AnotherAnnotation on a method
    @AnotherAnnotation(description = "This method is also annotated")
    public void anotherMethod() {
        System.out.println("Another annotated method");
    }


    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationsExample example = new AnnotationsExample();
        example.annotatedMethod();
        example.anotherMethod();
        System.out.println("Annotated field: " + example.annotatedField);
        Class<?> exampleClass = Home.class;
        Method method = exampleClass.getDeclaredMethod("toString");
        System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
    }
}
