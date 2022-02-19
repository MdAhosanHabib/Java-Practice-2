package chapter5;
import java.util.Scanner;
public class Level1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a power of 10: ");
        int number = sc.nextInt();
        String size;

        switch (number) {
          case 6:
            size = "Million";
            break;
          case 9:
            size = "Billion";
            break;
          case 12:
            size = "Trillion";
            break;
          case 15:
            size = "Quadrillion";
            break;
            case 18:
            size = "Quintillion";
            break;
            case 21:
            size = "Sextillion";
            break;
            case 30:
            size = "Nonillion";
            break;
          default:
            size = "Unknown";
            break;
        }
        System.out.println("Power of 10     Number");
        System.out.println("   "+number+"            "+size);
    }
    
}
