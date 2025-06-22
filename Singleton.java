// File: Logger.java
public class Singleton {

    // Private static instance of the same class
    private static Singleton singleInstance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Logger Initialized");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    // Sample log method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
