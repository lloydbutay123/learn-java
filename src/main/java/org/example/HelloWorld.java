package org.example;

public class HelloWorld {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        // Test this class directly
        System.out.println(greet("Test"));
    }
}
