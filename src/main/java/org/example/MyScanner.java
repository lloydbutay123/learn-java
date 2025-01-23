package org.example;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        // User input
        System.out.println("Enter second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        // User input
        System.out.println("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        //conditional statements
        if(operation.equals("addition")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("subtraction")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.equals("division")) {
            if(number2 == 0) {
                System.out.println("Can not divide by zero");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        } else if (operation.equals("multiplication")) {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        } else {
            System.out.printf("%s is not a supported operation", operation);
        }
        scanner.close();
    }
}
