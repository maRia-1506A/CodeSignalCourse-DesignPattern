// TODO: Define the Vehicle class with private members make and year of string and int type respectively
// Define a public constructor that initializes the make and year members
// Define a drive method that shows a message "Driving a vehicle made by make in the year year"

// TODO: Define the Car class that inherits from Vehicle
// Define an additional private member model of string type
// Define a public constructor that initializes make, year, and model using the superclass constructor
// Define a displayDetails method that calls the drive method and then shows the model "The model is model"
// In the displayDetails method, make use of the drive method from the Vehicle class

// TODO: Create an object of Car and call the displayDetails method to show its details

class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving a vehicle made by " + make + " in the " + year + " year");
    }
}

class Car extends Vehicle{
    private String model;

    public Car(String make, int year, String model){
        super(make, year);
        this.model= model;
    }

    public void displayDetails(){
        drive();
        System.out.println("The model is "+model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c= new Car("Toyota", 2022, "Corolla");
        c.displayDetails();
    }
}
