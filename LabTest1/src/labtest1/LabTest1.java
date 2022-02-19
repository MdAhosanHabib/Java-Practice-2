package labtest1;
import java.util.Scanner;
public class LabTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String users = sc.nextLine();
        System.out.println("");
        System.out.println("Enter your unit: ");
        int units = sc.nextInt();
        
        if(units <= 50){
            int crg = 40*units;
            if(crg >= 250){
            crg = crg + (crg/100)*15;
            System.out.println(users+" Your charge: "+crg);
            }else{
                crg = crg;
                System.out.println(users+" Your charge: "+crg);
            }
        }else if(units <= 100){
            int crg = 60*units;
            crg = crg + (crg/100)*15;
            System.out.println(users+" Your charge: "+crg);
        }else{
            int crg = 80*units;
            crg = crg + (crg/100)*15;
            System.out.println(users+" Your charge: "+crg);
        }
    }
}
