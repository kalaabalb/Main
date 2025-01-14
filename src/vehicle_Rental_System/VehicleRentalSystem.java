package vehicle_Rental_System;
import java.util.Scanner;
// Name                ID
// Kalaab Alebachew  1506623
// Hilina Tirusew    1506566


//Main class to manage vehicle rentals
public class VehicleRentalSystem {
 public static void main(String[] args) {
     Vehicle[] vehicles = {
         new Car("Toyota", "Corolla", 44, 9),
         new Truck("Ford", "F-250", 154, 36),
         new Motorcycle("Honda", "CB500F", 93,147)
     };

     Scanner scanner = new Scanner(System.in);
     boolean continueRental = true;

     while (continueRental) {
         System.out.println("========================================");
         System.out.println("           VEHICLE RENTAL SYSTEM         ");
         System.out.println("========================================");
         System.out.println("          Available Vehicles           ");
         System.out.println("----------------------------------------");

         for (int i = 0; i < vehicles.length; i++) {
             System.out.println("Available Option " + (i + 1) + ":\n" + vehicles[i].displayInfo());
             System.out.println("----------------------------------------");
         }

         System.out.println("0. Exit");
         System.out.print("\nEnter the number of the vehicle you want to rent: ");
         int choice = scanner.nextInt() ;

         if (choice == 0) {
             System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
             break;
         }

		if (choice < 0 || choice >= vehicles.length) {
            System.out.println("Invalid selection. Please try again.\n");
            continue;
		}

         Vehicle selectedVehicle = vehicles[choice];
         System.out.print("Enter the rental duration (in days): ");
         int days = scanner.nextInt();

         double totalCost = selectedVehicle.calculateRentalCost(days);
         System.out.println("\n========================================");
         System.out.println("             RENTAL DETIALS              ");
         System.out.println("========================================");
         System.out.println(selectedVehicle.displayInfo());
         System.out.println("Rental Duration: " + days + " day(s)");
         System.out.println("Total Cost: Birr " + totalCost);
         System.out.println("========================================\n");

         // Simulate payment
         System.out.print("Confirm payment of Birr " + totalCost + "\n (enter '1' to confirm, any integer to cancel): ");
         int paymentConfirmation = scanner.nextInt();
             
            	 if (paymentConfirmation == 1) {
            		 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
                     System.out.println("Payment successful. Thank you for your rental!");
                 } else {
                     System.out.println("Payment canceled. Return to the main menu.");
                 }
				
			
        
         

         // Ask if the customer wants another rental
         System.out.print("\n Would you like to rent another vehicle? \n ('0' for Yes, any number for No): ");
         int anotherRental = scanner.nextInt();
         if (anotherRental == 0) {
            System.out.println("to the main page");
         }else {
        	 System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
        	 continueRental = false;
         }
     }

     scanner.close();
 }
 }


