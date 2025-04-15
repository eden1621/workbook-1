package RentalCarCalculator;

import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pickup date (MM/DD/YYYY");
        String pickupDate = scanner.nextLine();
        //Rates
        double dailyRate = 29.99;
        double tollTagRate = 3.95;
        double gpsRate = 2.95;
        double roadsideRate = 3.95;

        //Calculated components
        double tollCost = 0.0;
        double gpsCost = 0.0;
        double assistanceCost = 0.0;

        System.out.print("Enter pickup date: ");
        String pickupDate = scanner.nextLine();
        System.out.print("Enter the number of days for rental: ");
        System.out.print("Do you want an electronic toll tag (yes/no: ");
        scanner.nextLine();
        String tollTagChoice = scanner.nextLine();
        //GPS
        System.out.print("Do you want a GPS($2.95/day)? (yes/no):");
        String gpsChoice = scanner.nextLine();
        //Ask roadside
        System.out.print("Do you want roadside assistance ($3.95/day)? (yes/no): ");
        String assistanceChoice = scanner.nextLine();
        int age = scanner.nextInt();



        switch(tollTagChoice.toLowerCase()){
            case "yes":
                tollCost = tollRate * rentalDays;
                break;
            case "no":
                tollCost = 0.0;
                break;
            default:
                System.out.println("invalid input. no toll tag.");
                tollCost = 0.0;
                break;
        }
            switch (gpsChoice.toLowerCase()) {
                case "yes":
                    gpsCost = gpsRate * rentalDays;
                    break;
                case "no":
                    gpsCost =0.0;
                    break;
                default:
                    System.out.println("Invalid input for GPS. think 'no'");
        }


               


    }
}
