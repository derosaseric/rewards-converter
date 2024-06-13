public class RewardValue {
    private double cashValue;
    private double mileValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = roundToTwoDecimals(cashValue);
        this.mileValue = roundToTwoDecimals(cashValue / MILES_TO_CASH_RATE);
    }

    // Constructor that accepts mile value
    public RewardValue(int mileValue) {
        this.mileValue = roundToTwoDecimals(mileValue);
        this.cashValue = roundToTwoDecimals(mileValue * MILES_TO_CASH_RATE);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return mileValue;
    }

    // Helper method to round values to 2 decimal places
    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
