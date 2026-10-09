package pwr.edu.pl;

/**
 * Calculator for order discounts.
 */
public class DiscountCalculator
{
    /**
     * Calculates discount for given amount.
     * @param amount order amount
     * @return discount value
     */
    public double calculateDiscount(double amount)
    {
        if (amount > 100.0)
        {
            return amount * 0.1;
        }
        return 0.0;
    }
}