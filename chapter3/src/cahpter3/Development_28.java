package cahpter3;
import java.util.Scanner;

public class Development_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int purchasePrice, tenderedAmount;
        float convertedchange, convertedPurchasePrice, convertedTenderedAmount;
        
        System.out.print("Please enter Purchase Price in Cents: "); 
        purchasePrice=scanner.nextInt(); 
        System.out.print("Please enter Amount Tendered in Cents: "); 
        tenderedAmount=scanner.nextInt();
        
        convertedPurchasePrice=purchasePrice/100f;
        convertedTenderedAmount=tenderedAmount/100f;
        convertedchange=convertedTenderedAmount-convertedPurchasePrice;
        
        double cents = convertedchange * 100;
        double dollar = 100;
        double quarter = 25;
        double dime = 10;
        double nickel = 5;
        double penny = 1;

        double totalDollar = (cents / dollar);
        int resultDollar = (int) totalDollar;
        cents %= dollar;

        double totalQuarter = (cents / quarter);
        int resultQuarter = (int) totalQuarter;
        cents %= quarter;

        double totalDime = (cents / dime);
        int resultDime = (int) totalDime;
        cents %= dime;

        double totalNickel = (cents / nickel);
        int resultNickel = (int) totalNickel;
        cents %= nickel;

        double totalPenny = (cents / penny);
        int resultPenny = (int) totalPenny;
        cents %= penny;

        System.out.println("___________________________________________");
        System.out.println("Purchase price:  $"+convertedPurchasePrice); 
        System.out.println("Amount Tendered: $"+convertedTenderedAmount);
        System.out.println();
        System.out.printf("Your change is:  $ %.2f \n",convertedchange);
        System.out.println();
        System.out.println(resultDollar+" one-dollar bill(s)");
        System.out.println(resultQuarter+" quarter(s)");
        System.out.println(resultDime+" dime(s)");
        System.out.println(resultNickel+" nickel(s)");
        System.out.println(resultPenny+" penn(y/ies)");
        System.out.println();
        System.out.println("Thank you for your business. Come back soon.");
    }
}
