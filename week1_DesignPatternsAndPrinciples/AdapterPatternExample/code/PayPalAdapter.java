package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal = new PayPal();

    public void pay(int amount) {
        paypal.makePayment(amount);
    }
}
