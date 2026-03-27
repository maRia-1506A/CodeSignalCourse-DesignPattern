// TODO: Implement the static nested CarBuilder class
// TODO: Declare the required and optional parameters
// TODO: Implement the constructor for the required parameters
// TODO: Implement setters for the optional parameters
// TODO: Implement the build method that returns a new Car object

// TODO: Use the CarBuilder to build a Car object with make, model, and optional parameters
// TODO: Print out some of the Car properties using the getters

public class Car {

    // Required parameters
    private String make;
    private String model;

    // Optional parameters
    private boolean hasSunroof;
    private boolean hasGPS;
    private boolean hasHeatedSeats;

    // Private constructor to enforce the use of the builder
    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
        this.hasHeatedSeats = builder.hasHeatedSeats;
    }

    // Getters (optional)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasHeatedSeats() {
        return hasHeatedSeats;
    }

    public static class CarBuilder {

        // Required parameters
        private final String make;
        private final String model;

        // Optional parameters with default values
        private boolean hasSunroof = false;
        private boolean hasGPS = false;
        private boolean hasHeatedSeats = false;

        // Constructor for required parameters
        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // Setter for hasSunroof
        public CarBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        // Setter for hasGPS
        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        // Setter for hasHeatedSeats
        public CarBuilder setHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        // Build method
        public Car build() {
            return new Car(this);
        }

    }

    public static void main(String[] args) {
        // Building a Car object using the CarBuilder
        Car car = new Car.CarBuilder("Toyota", "Camry")
                .setSunroof(true)
                .setGPS(true)
                .setHeatedSeats(true)
                .build();

        // Printing Car properties using getters
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Has sunroof: " + car.hasSunroof());
        System.out.println("Has GPS: " + car.hasGPS());
        System.out.println("Has heated seats: " + car.hasHeatedSeats());
    }

}