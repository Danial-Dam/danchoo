public class PickUpPointDelivery implements IDelivery {

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered to pickup point");
    }
}
