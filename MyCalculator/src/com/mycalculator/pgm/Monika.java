package com.mycalculator.pgm;

import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double div(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Divide by zero error!!!");
        }
    }
}

public class Monika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator");
        System.out.println("Simple Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Please Select an Operation (1/2/3/4): ");
        int choice = sc.nextInt();
        
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice");
            
        }
        
        
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        double result = 0;

        Calculator calculator = new Calculator();

        if (choice == 1) {
            result = calculator.add(a, b);
            System.out.println("The sum is " + result);
        } else if (choice == 2) {
            result = calculator.sub(a, b);
            System.out.println("The difference is " + result);
        } else if (choice == 3) {
            result = calculator.mul(a, b);
            System.out.println("The product is " + result);
        } else if (choice == 4) {
            result = calculator.div(a, b);
            System.out.println("The quotient is " + result);
        }
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        String continueChoice = sc.next();
        if (continueChoice.equalsIgnoreCase("yes")) {
            main(args);
        } else {
            System.out.println("Thank you!");
            
        }

        

        sc.close();
    }
}
