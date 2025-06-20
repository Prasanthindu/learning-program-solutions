package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalPayment = new PayPalAdapter();
        paypalPayment.pay(100);

        PaymentProcessor stripePayment = new StripeAdapter();
        stripePayment.pay(200);
    }
}
