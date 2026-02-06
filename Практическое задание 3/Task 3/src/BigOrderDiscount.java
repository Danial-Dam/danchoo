public class BigOrderDiscount implements IDiscount {

    @Override
    public double apply(double total) {
        if (total > 1000) {
            return total * 0.9;
        }
        return total;
    }
}
