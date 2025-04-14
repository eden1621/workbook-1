package com.pluralsight;

import java.util.Scanner;
 public class BasicCalculator {
    public static void main(String[] args) {
        //create scanner object to read from user
        Scanner scanner = new Scanner(System.in);
        //prompt for the first number
        System.out.print("Enter the first number");
        float num1 = scanner.nextFloat();
        //prompt for the second number
        System.out.print("Enter the second number:");
        float num2 = scanner.nextFloat();
        //Display calculation option
        System.out.println("Add");
        System.out.println("subtract");
        System.out.println("Multiply");
        System.out.println("Divide");
        //ask the user
        System.out.print("Please select an option: ");
        float result = num1 * num2;
        //show the result of multiplication
        System.out.println(num1 + " * " + num2 + " = " + result);





    }



}
