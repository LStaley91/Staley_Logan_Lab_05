public class Lab_05_01_ShipCostCalculator
{
    public static void main(String[] args)
    {
        double itemPrice = 100.12;
        System.out.println("The price of your Item is $"+itemPrice);

        if (itemPrice >= 100)
        {
            double totalCost = itemPrice * 1.02;
            System.out.println("Your Total Cost with tax is $" + totalCost);
        }
        else
        {
            double totalCost = itemPrice;
            System.out.println("Your Total Cost without tax is $" + totalCost);

        }

    }
}
