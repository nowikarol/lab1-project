package pwr.edu.pl;

/**
 * Processor for handling orders.
 */
public class OrderProcessor
{
    private final DiscountCalculator calculator = new DiscountCalculator();

    /**
     * Processes order and applies discount.
     * @param amount order amount
     * @return final amount after discount
     */
    public double processOrder(double amount)
    {
        double discount = calculator.calculateDiscount(amount);
        return amount - discount;
    }
}