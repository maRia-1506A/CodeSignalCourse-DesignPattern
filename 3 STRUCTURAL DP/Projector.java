// FACADE DP

// TODO: Define the Projector class with methods to turn on, display, and turn off
// TODO: Define the SoundSystem class with methods to start, play sound, and stop
// TODO: Define the Lights class with methods to dim and brighten
// TODO: Define the HomeTheaterFacade class

// TODO: Create private member variables for Projector, SoundSystem, and Lights
// TODO: In the constructor, initialize these member variables
// TODO: Implement the watchMovie method to orchestrate starting movie components
// TODO: Implement the endMovie method to orchestrate stopping movie componentspublic class Main

// TODO: Create an instance of the HomeTheaterFacade
// TODO: Simulate watching movie and call endMovie on the instance

public class Projector {
    public void turnOn() {
        System.out.println("Projector is turned on.");
    }

    public void display() {
        System.out.println("Projector is displaying the movie.");
    }

    public void turnOff() {
        System.out.println("Projector is turned off.");
    }

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie(); // Start movie
        homeTheater.endMovie();   // End movie
    }
}

class SoundSystem {
    public void start() {
        System.out.println("Sound system is starting.");
    }

    public void playSound() {
        System.out.println("Sound system is playing sound.");
    }

    public void stop() {
        System.out.println("Sound system is stopped.");
    }
}

class Lights {
    public void dim() {
        System.out.println("Lights are dimmed.");
    }

    public void brighten() {
        System.out.println("Lights are brightened.");
    }
}

class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade() {
        projector = new Projector();
        soundSystem = new SoundSystem();
        lights = new Lights();
    }

    public void watchMovie() {
        System.out.println("Starting movie...");

        lights.dim();
        projector.turnOn();
        projector.display();
        soundSystem.start();
        soundSystem.playSound();

        System.out.println("Movie is now playing.");
    }

    public void endMovie() {
        System.out.println("Ending movie...");

        projector.turnOff();
        soundSystem.stop();
        lights.brighten();

        System.out.println("Movie ended.");
    }
}