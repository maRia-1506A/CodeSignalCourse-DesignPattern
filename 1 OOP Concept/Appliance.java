// TODO: Define an abstract class Appliance
// TODO: In the Appliance class, declare two abstract methods: turnOn and turnOff

// TODO: Define a class Television that inherits from Appliance
// TODO: Implement the turnOn method to print "The television is now ON."
// TODO: Implement the turnOff method to print "The television is now OFF."

// TODO: Define a class WashingMachine that inherits from Appliance
// TODO: Implement the turnOn method to print "The washing machine is now ON."
// TODO: Implement the turnOff method to print "The washing machine is now OFF."

// TODO: Create an instance of Appliance that points to a Television object and call its turnOn and turnOff methods
// TODO: Change the instance to point to a WashingMachine object and call its turnOn and turnOff methods

public abstract class Appliance {
    abstract void turnOn();

    abstract void turnOff();

    public static void main(String[] args) {
        Appliance appliance = new Television();
        appliance.turnOn();
        appliance.turnOff();

        System.out.println();

        appliance = new WashingMachine();
        appliance.turnOn();
        appliance.turnOff();

    }
}

class Television extends Appliance {
    public void turnOn() {
        System.out.println("The television is now ON.");
    }

    public void turnOff() {
        System.out.println("The television is now Off.");
    }
}

class WashingMachine extends Appliance {
    public void turnOn() {
        System.out.println("The washing machine is now ON.");
    }

    public void turnOff() {
        System.out.println("The washing machine is now Off.");
    }

}
