package com.pluralsight;

public class MathApp {
    //this is the main method and where my code will run from
    //all code I am typing for this exercise will be in this method

    public static void main(String[] args) {
        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);


        System.out.println("The highest salary is " + highestSalary);

        int carPrice = 32000;
        int truckPrice = 4400;

        System.out.println("The lowest price is " +Math.min(carPrice,truckPrice) );
       /*
      radius = 3.14 x rXr
        radius = 3.14 x 7.25 x 7.25
        */
        double radius= 7;
        double area = Math.PI * radius * radius;
        System.out.println ( "area of the circle is " + area );

        double number = 5.0;
        double Square root = Math square (number);
        System.out.println("The square root of " + number + " is:" +square root);


       double * x1 =5;
       double * x2 = 85;
       double * y1 = 10;
       double * y2 = 50;
       #calculate the distance using the formula we googled

       Double distance = Math.sqrt(Math.pow(x2 -x1,2) + Math.pow(y2-y1,2));
       #print out the distance for the user

       System.out.println("The distance is:" + distance);


      double x = -3.8;
      double absValue = Math.abd(x);
      //print out the absolute value
      System.out.println(The absolut value of " + x +" is: " +absValue);


      System.out.println("A random number between 0 and 1 is : " + Math.radom() * (100-20 +1) +1);

      if(MAth.random() > .8);



    }








}
