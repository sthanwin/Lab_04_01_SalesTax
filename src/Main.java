public class Main {
    public static void main(String[] args) {

        double purchasePrice = 200.54;
        final double SALES_TAX_RATE = .05;
        double salesTax = 0;
        double totalCost = 0;

        System.out.println("You said your price is " + purchasePrice);

        salesTax = purchasePrice * SALES_TAX_RATE;
        totalCost = salesTax + purchasePrice;

        System.out.println("The sales tax is " + salesTax);
        System.out.println("The total cost is " + totalCost);

        System.out.printf("\nSales tax rounded is %6.2f ", salesTax);
    }
}