package chapter4;
import java.util.Scanner;

public class Development_16 {
    public static void main(String[] args)
    {
    CoffeeBag coffebag = new CoffeeBag();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Number of Bags: ");
    int numberOfBags = sc.nextInt();
    System.out.print("Weight per Bag: ");
    int bagWeight = sc.nextInt();
    
    coffebag.priceGet(numberOfBags,bagWeight);
    }
}
