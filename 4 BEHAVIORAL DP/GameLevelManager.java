// TEMPLATE METHOD PATTERN 

// TODO: Define an abstract class named GameLevelManager
// - Add a final template method playLevel() that calls the methods:
//   - initializeLevel()
//   - startLevel()
//   - completeLevel()
//   - cleanupLevel()
// - Implement the method initializeLevel() to print "Initializing the game level."
// - Define abstract methods: startLevel(), completeLevel(), and cleanupLevel() 
// TODO: Define a class named EasyLevel that extends GameLevelManager
// - Implement the startLevel() method to print "Starting Easy Level."
// - Implement the completeLevel() method to print "Completing Easy Level."
// - Implement the cleanupLevel() method to print "Cleaning up after Easy Level."
// TODO: Define a class named HardLevel that extends GameLevelManager
// - Implement the startLevel() method to print "Starting Hard Level."
// - Implement the completeLevel() method to print "Completing Hard Level."
// - Implement the cleanupLevel() method to print "Cleaning up after Hard Level."
// TODO: Create an instance of EasyLevel
// TODO: Call playLevel() on the EasyLevel instance

// TODO: Create an instance of HardLevel
// TODO: Call playLevel() on the HardLevel instance

// Abstract class
public abstract class GameLevelManager {

    // Template method (final so it cannot be overridden)
    public final void playLevel() {
        initializeLevel();
        startLevel();
        completeLevel();
        cleanupLevel();
    }

    // Concrete method
    public void initializeLevel() {
        System.out.println("Initializing the game level.");
    }

    // Abstract methods
    public abstract void startLevel();

    public abstract void completeLevel();

    public abstract void cleanupLevel();

    public static void main(String[] args) {

        // Easy level
        GameLevelManager easy = new EasyLevel();
        easy.playLevel();

        System.out.println();

        // Hard level
        GameLevelManager hard = new HardLevel();
        hard.playLevel();
    }
}

// EasyLevel class
class EasyLevel extends GameLevelManager {

    @Override
    public void startLevel() {
        System.out.println("Starting Easy Level.");
    }

    @Override
    public void completeLevel() {
        System.out.println("Completing Easy Level.");
    }

    @Override
    public void cleanupLevel() {
        System.out.println("Cleaning up after Easy Level.");
    }
}

// HardLevel class
class HardLevel extends GameLevelManager {

    @Override
    public void startLevel() {
        System.out.println("Starting Hard Level.");
    }

    @Override
    public void completeLevel() {
        System.out.println("Completing Hard Level.");
    }

    @Override
    public void cleanupLevel() {
        System.out.println("Cleaning up after Hard Level.");
    }
}