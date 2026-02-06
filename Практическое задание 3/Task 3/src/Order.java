import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> items = new ArrayList<>();
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;
    private List<INotification> notifications = new ArrayList<>();

    public void addItem(String name, int quantity, double price) {
        items.add(new OrderItem(name, quantity, price));
    }

    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }


    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    public void addNotification(INotification notification) {
        notifications.add(notification);
    }

    public void notifyCustomer(String message) {
        for (INotification notification : notifications) {
            notification.sendNotification(message);
        }
    }

    public void pay() {
        if (paymentMethod != null) {
            paymentMethod.processPayment(getTotalPrice());
        }
    }

    public void deliver() {
        if (deliveryMethod != null) {
            deliveryMethod.deliverOrder(this);
        }
    }
}
