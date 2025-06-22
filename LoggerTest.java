// File: LoggerTest.java
public class LoggerTest {
    public static void main(String[] args) {

        Singleton logger1 = Singleton.getInstance();
        logger1.log("First message");

        Singleton logger2 = Singleton.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different instances exist (should not happen).");
        }
    }
}
