package vehicle_Rental_System;

//Subclass representing a car
class Car extends Vehicle {
 private int seatingCapacity; // Number of seats in the car

 public Car(String make, String model, double rentalPricePerDay, int seatingCapacity) {
     super(make, model, rentalPricePerDay);
     this.seatingCapacity = seatingCapacity;
 }

 @Override
 public String displayInfo() {
     return "Car Details:\n" +
            "  Make: " + getMake() + "\n" +
            "  Model: " + getModel() + "\n" +
            "  Price per Day: $" + getRentalPricePerDay() + "\n" +
            "  Seating Capacity: " + seatingCapacity;
 }
}
