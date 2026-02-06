public class CourierDelivery implements IDelivery {

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered by courier");
    }
}
