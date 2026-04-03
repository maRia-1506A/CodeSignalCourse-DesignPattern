// BRIDGE DP

// TODO: Define the OperatingSystem interface with a method void run(String device);
// TODO: Implement LinuxOS class that implements the OperatingSystem interface.
// TODO: Override the run method to print a message indicating that the device is running on Linux OS.
// TODO: Implement ChromeOS class that implements the OperatingSystem interface.
// TODO: Override the run method to print a message indicating that the device is running on Chrome OS.
// TODO: Define the abstract Device class with a protected OperatingSystem field.
// TODO: Create a constructor that accepts an OperatingSystem as a parameter and initializes the field.
// TODO: Declare an abstract method start().// TODO: Implement Laptop class that extends Device.
// TODO: Implement the constructor to accept an OperatingSystem and pass it to the superclass constructor.
// TODO: Override the start method to print "Laptop:" and call the run method of the OperatingSystem.
// TODO: Implement Tablet class that extends Device.
// TODO: Implement the constructor to accept an OperatingSystem and pass it to the superclass constructor.
// TODO: Override the start method to print "Tablet:" and call the run method of the OperatingSystem.
// TODO: Implement the Main class with a main method to run the application.
// TODO: In the main method, create an instance of Laptop with LinuxOS and call its start method.
// TODO: In the main method, create an instance of Tablet with ChromeOS and call its start method.

// TODO: Create and run a Laptop on Linux OS
// TODO: Create and run a Tablet on Chrome OS

public interface OperatingSystem {
    void run(String device);

    public static void main(String[] args) {
        // Laptop on Linux OS
        Device laptop = new Laptop(new LinuxOS());
        laptop.start();

        // Tablet on Chrome OS
        Device tablet = new Tablet(new ChromeOS());
        tablet.start();
    }

}

class LinuxOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println("Running " + device + " on Linux OS.");
    }
}

class ChromeOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println("Running " + device + " on Chrome OS.");
    }
}

abstract class Device {
    protected OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    public abstract void start();
}

class Laptop extends Device {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.print("Laptop: ");
        os.run("Laptop");
    }
}

class Tablet extends Device {
    public Tablet(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.print("Tablet: ");
        os.run("Tablet");
    }
}
