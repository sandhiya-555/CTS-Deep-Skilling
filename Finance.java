// File: FinancialForecast.java
public class Finance {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 1000;     // Starting amount
        double growthRate = 0.1;        // 10% annual growth
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);

        System.out.printf("Future value after %d years: ₹%.2f\n", years, result);
    }
}
