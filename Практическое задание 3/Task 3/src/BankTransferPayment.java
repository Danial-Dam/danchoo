public class BankTransferPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by Bank Transfer: " + amount);
    }
}
