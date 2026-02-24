package com.neha.generic.concepts;

import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchExpressionExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        String value = switch (val) {
            case "a" -> "Letter A";
            case "b" -> "Letter B";
            case "c" -> {
                System.out.println("This is to show yield example");
                yield  "Letter C";
            }
            default -> "Default value: " + val;
        };

        System.out.println("Input: " + val);
        System.out.println("Output: " + value);

        switch(val){
            case "a":
                System.out.println("Letter A");
                break;
            case "b":
                System.out.println("Letter B");
                break;
            default:
                System.out.println("Default value: " + val);
        }
    }
}
