// TODO: Implement the SINGLETON pattern for this class

// TODO: Create a private constructor to prevent instantiation from other classes
// Print statement to indicate the constructor is only called once per JVM

// TODO: Create a static inner helper class that holds the Singleton instance

// TODO: Create a public method to provide access to the Singleton instance

// TODO: Use the Main class to test the Singleton pattern

// TODO: Get the Singleton instance using getInstance() method

// TODO: Call the getInstance method again to demonstrate Singleton behavior

public class SessionManager {
    // private constructor
    private SessionManager() {
        System.out.println("Instance created");
    }

    // static inner helper class
    private static class helper {
        private static final SessionManager INSTANCE = new SessionManager();
    }

    // public method
    public static SessionManager getInstance() {
        return helper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello");
    }

    // Main class
    public static void main(String[] args) {
        SessionManager s1 = SessionManager.getInstance();
        s1.showMessage();

        SessionManager s2 = SessionManager.getInstance();
        s2.showMessage();

        if (s1 == s2) {
            System.out.println("Both objects are same");
        } else {
            System.out.println("Objects are different");
        }
    }
}