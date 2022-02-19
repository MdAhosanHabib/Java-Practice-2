package cahpter3;
import java.util.*;

public class Level2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your Earth's weight(KG): ");
        int earth = sc.nextInt();
        
        double mercury = earth * 0.4;
        double venus   = earth * 0.9;
        double jupiter = earth * 2.5;
        double saturn  = earth * 1.1;
        
        System.out.print("Planet                 Weight"+"\n");
        System.out.print("__________________________________________"+"\n");
        System.out.printf("Mercury                %.2f \n", mercury);
        System.out.printf("Venus                  %.2f \n", venus);
        System.out.printf("Jupiter                %.2f \n", jupiter);
        System.out.printf("Saturn                 %.2f \n", saturn);
    }
}
