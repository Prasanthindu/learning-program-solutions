package AdapterPatternExample;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe = new Stripe();

    public void pay(int amount) {
        stripe.processPayment(amount);
    }
}
