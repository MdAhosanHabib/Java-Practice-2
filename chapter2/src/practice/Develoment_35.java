package practice;
import java.util.*;

public class Develoment_35 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Name: ");
        String a = sc.nextLine();
        System.out.print("Enter Middle Name: ");
        String b = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String c = sc.nextLine();
        
        System.out.print(c +", "+a +" "+ b.substring(0, 1)+"\n");
    }
}
