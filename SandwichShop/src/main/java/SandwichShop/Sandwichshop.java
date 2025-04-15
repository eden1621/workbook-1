package SandwichShop;

import java.util.Scanner;

public class Sandwichshop{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt for Sandwich size
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("Select sandwich size:");
        System.out.println("1- Regular ($5.45)");
        System.out.println("2 - Larage ($8.95)");
        System.out.print("Enter Sandwich size (1 or 2): ");
        int sandwichSize = scanner.nextInt();
        //Set base price based on size
        float price = 0f;
        if (sandwichSize == 1){
            price = 5.45f;
        }else if (sandwichSize == 2){
            price = 8.95f;
        }else {
            System.out.println("Invalid sandwich size.");
        }
      //Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner .nextInt();
        //apply discount
        float discount = 0f;
        if (age <=17){
            discount = 0.10f;
        }else if (age >= 65){
            discount = 0.20f;
        }
        //final price
        float finalPrice = price * (1 - discount);
        System.out.printf("Final price : $%.2f%n",finalPrice);
}
}
