package pwr.edu.pl;

/**
 * Main application class.
 */
public class App
{
    /**
     * Main entry point.
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        OrderProcessor processor = new OrderProcessor();
        double finalPrice = processor.processOrder(150.0);
        System.out.println("Final price: " + finalPrice);
    }
}