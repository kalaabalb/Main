package vehicle_Rental_System;

//Abstract base class representing a generic vehicle
abstract class Vehicle {
 private String make;
 private String model; 
 private double rentalPricePerDay; 

 public Vehicle(String make, String model, double rentalPricePerDay) {
     this.make = make;
     this.model = model;
     this.rentalPricePerDay = rentalPricePerDay;
 }

 public double calculateRentalCost(int days) {
     return rentalPricePerDay * days;
 }

 public String getMake() {
     return make;
 }

 public String getModel() {
     return model;
 }

 public double getRentalPricePerDay() {
     return rentalPricePerDay;
 }

 public abstract String displayInfo();
}