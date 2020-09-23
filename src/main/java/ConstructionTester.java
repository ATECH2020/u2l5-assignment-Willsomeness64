import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

    double lumberCost = 8;
    double windowCost = 11;
    double taxRate, total;
    int numBoards;
    int numGlass;
    double grandTotal;
    

    System.out.println("Enter the sales tax rate:");
    taxRate = in.nextDouble();
    System.out.println("How many boards do you need? ");
    numBoards = in.nextInt();
    System.out.println("How many windows do you need? ");
    numGlass = in.nextInt();

   Construction shop = new Construction(lumberCost, windowCost, taxRate);


   total = shop.lumberCost(numBoards) + shop.windowCost(numGlass);
   System.out.println("Total: " + total);
   System.out.println("Grand Total: " + shop.grandTotal(total));


    }
}
