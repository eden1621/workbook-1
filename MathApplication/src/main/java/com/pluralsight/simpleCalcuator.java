package com.pluralsight;

import java.util.Scanner;

public class simpleCalcuator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        //let's great our user
        System.out.println("Welcome to my addition machine!");

        //ask the user for the dirst number
        System.out.println("What is the first number we are going to add? ");
        int num1 =myScanner.nextInt();

        //ask the user for the second number
        System.out.println("what is the second number we are going to add ");
         int num2 =myScanner.nextInt();

         //do the math
        int sum = num1=num2;
        //display the sum to the user
        System.out.println("The sum is: " +sum);
    }


}
