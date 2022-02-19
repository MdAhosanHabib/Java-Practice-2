package cahpter3;
import java.util.*;

public class Level1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input centimeter: ");
        int centimeter = sc.nextInt();
        Conversion_length(centimeter);
        System.out.print("\n");
    }
    static double Conversion_length(int centimeter)   
    {
    double inch, feet;  
    inch  = 0.3937 * centimeter;   
    feet = 0.0328 * centimeter;   
    System.out.printf("Inches is: %.2f \n", inch);   
    System.out.printf("Feet is: %.2f", feet);   
    return 0;   
    } 
}
