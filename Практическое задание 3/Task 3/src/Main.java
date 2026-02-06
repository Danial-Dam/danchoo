public class Main {

    public static void main(String[] args) {


        Order order = new Order();
        order.addItem("Laptop", 1, 1000);
        order.addItem("Mouse", 2, 50);


        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.addDiscount(new BigOrderDiscount());

        double total = order.getTotalPrice();
        double finalPrice = discountCalculator.calculate(total);
        System.out.println("Final price: " + finalPrice);


        order.setPaymentMethod(new CreditCardPayment());
        order.setDeliveryMethod(new CourierDelivery());


        order.addNotification(new EmailNotification());
        order.addNotification(new SmsNotification());


        order.pay();
        order.deliver();
        order.notifyCustomer("Order completed!");
    }
}
