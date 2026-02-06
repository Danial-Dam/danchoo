public class PayPalPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by PayPal: " + amount);
    }
}
