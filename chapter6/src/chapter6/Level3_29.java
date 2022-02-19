package chapter6;
import java.util.Scanner;
public class Level3_29 {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if ((i == 1 || i == n || j == 1 || j == n) ||
                (i >= 3 && i <= n - 2 && j >= 3 && j <= n - 2) &&
                    (i == 3 || i == n - 2 || j == 3 || j == n - 2)) 
            {           
            System.out.print("-"); 
            } 
            else
            {    
            System.out.print(" "); 
            }
        }
        System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
