package chapter4;
import java.util.Scanner;

public class Level2_12 {
    public static void main(String[] args)
    {
    Height height = new Height();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please Enter Age(Year): ");
    int age = sc.nextInt();
    System.out.print("Please Enter Height(CM): ");
    int heig = sc.nextInt();
    
    height.heightget(age,heig);
    
    }
}
