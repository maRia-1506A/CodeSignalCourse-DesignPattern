// STRATEGY DP

// TODO: Define the TransportStrategy interface that declares the travel method.
// TODO: Implement the CarTransport class that should allow traveling by car.
// - Implement the TransportStrategy interface.
// - Override the travel method to print a message indicating travel by car to the destination.

// TODO: Implement the TrainTransport class that should allow traveling by train.
// - Implement the TransportStrategy interface.
// - Override the travel method to print a message indicating travel by train to the destination.

// TODO: Implement the AirplaneTransport class that should allow traveling by airplane.
// - Implement the TransportStrategy interface.
// - Add a private field for the flight number.
// - Implement a constructor to initialize the flight number.
// - Override the travel method to print a message indicating travel by airplane to the destination, including the flight number.

// TODO: Implement the TravelPlanner class to plan trips using different transport strategies.
// - Add a private field of type TransportStrategy named strategy.
// - Implement the setTransportStrategy method to change the strategy at runtime.
// - Implement the planTrip method to call travel on the current strategy. If no strategy is set, print "No transport strategy set".

// TODO: Complete the Main class to demonstrate the TravelPlanner with different transport strategies.
// - Initialize TravelPlanner.
// - Create instances of CarTransport, TrainTransport, and AirplaneTransport with a sample flight number.
// - Set different transport strategies on the TravelPlanner and call planTrip with different destinations.

public interface TransportStrategy {
    void travel(String destination);

    public static void main(String[] args) {
        TravelPlanner planner = new TravelPlanner();

        TransportStrategy car = new CarTransport();
        TransportStrategy train = new TrainTransport();
        TransportStrategy airplane = new AirplaneTransport("BG-101");

        planner.setTransportStrategy(car);
        planner.planTrip("Dhaka");

        planner.setTransportStrategy(train);
        planner.planTrip("Chittagong");

        planner.setTransportStrategy(airplane);
        planner.planTrip("Cox's Bazar");
    }
}

class CarTransport implements TransportStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling by car to " + destination);
    }
}

class TrainTransport implements TransportStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling by train to " + destination);
    }
}

class AirplaneTransport implements TransportStrategy {
    private String flightNumber;

    public AirplaneTransport(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void travel(String destination) {
        System.out.println("Traveling by airplane to " + destination +
                " with flight number: " + flightNumber);
    }
}

class TravelPlanner {
    private TransportStrategy strategy;

    public void setTransportStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void planTrip(String destination) {
        if (strategy != null) {
            strategy.travel(destination);
        } else {
            System.out.println("No transport strategy set");
        }
    }
}
