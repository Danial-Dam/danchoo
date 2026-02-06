public class CreditCardPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by Credit Card: " + amount);
    }
}
