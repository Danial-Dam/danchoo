import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {

    private List<IDiscount> discounts = new ArrayList<>();

    public void addDiscount(IDiscount discount) {
        discounts.add(discount);
    }

    public double calculate(double total) {
        double finalTotal = total;
        for (IDiscount discount : discounts) {
            finalTotal = discount.apply(finalTotal);
        }
        return finalTotal;
    }
}
