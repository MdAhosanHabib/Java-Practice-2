package cahpter3;
import java.util.*;

public class Level3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of bags sold: ");
        int bags = sc.nextInt();
        System.out.print("Unit weight of a bag(Pound): ");
        int weight = sc.nextInt();
        
        double totalPrice = weight * bags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.print("________________________________"+"\n");
        System.out.print("Number of bag sold:  "+bags+"\n");
        System.out.print("Weight per bag:      "+weight+" lb"+"\n");
        System.out.print("Price per Pound:     $5.99"+"\n");
        System.out.print("Sales tax:           7.25%"+"\n");
        System.out.print("\n");
        System.out.printf("Total Price         $ %.3f \n", totalPriceWithTax);
    }
}
