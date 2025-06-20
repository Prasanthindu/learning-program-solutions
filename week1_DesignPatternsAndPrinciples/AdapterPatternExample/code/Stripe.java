package AdapterPatternExample;

public class Stripe {
    public void processPayment(int amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " using Stripe.");
    }
}
