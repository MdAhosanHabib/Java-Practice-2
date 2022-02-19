package cahpter3;
import java.util.*;

public class Level1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input degrees Celsius: ");
        int celsius = sc.nextInt();
        Conversion_length(celsius);
        System.out.print("\n");
    }
    static double Conversion_length(int celsius)   
    {
    double fahrenheit;  
    fahrenheit  = 1.8 * celsius + 32;     
    System.out.printf("Degrees Fahrenheit is: %.2f \n", fahrenheit);     
    return 0;   
    }
}
