package vehicle_Rental_System;

//Subclass representing a truck
class Truck extends Vehicle {
 private int loadCapacity; // Load capacity in tons

 public Truck(String make, String model, double rentalPricePerDay, int loadCapacity) {
     super(make, model, rentalPricePerDay);
     this.loadCapacity = loadCapacity;
 }

 @Override
 public String displayInfo() {
     return "Truck Details:\n" +
            "  Make: " + getMake() + "\n" +
            "  Model: " + getModel() + "\n" +
            "  Price per Day: $" + getRentalPricePerDay() + "\n" +
            "  Load Capacity: " + loadCapacity + " tons";
 }
}