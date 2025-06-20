package AdapterPatternExample;

public class PayPal {
    public void makePayment(int amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " using PayPal.");
    }
}
