package vehicle_Rental_System;

//Subclass representing a motorcycle
class Motorcycle extends Vehicle {
 private int engineCapacity; // Engine capacity in cc

 public Motorcycle(String make, String model, double rentalPricePerDay, int engineCapacity) {
     super(make, model, rentalPricePerDay);
     this.engineCapacity = engineCapacity;
 }

 @Override
 public String displayInfo() {
     return "Motorcycle Details:\n" +
            "  Make: " + getMake() + "\n" +
            "  Model: " + getModel() + "\n" +
            "  Price per Day: $" + getRentalPricePerDay() + "\n" +
            "  Engine Capacity: " + engineCapacity + " cc";
 }
}
