package practice;
import javax.swing.*;
import java.util.*;

public class Level2_22 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        JFrame myWindow = new JFrame( );
        
        System.out.print("Enter Wide- ");
        int a= sc.nextInt();
        System.out.print("Enter Hight- "); 
        int b= sc.nextInt();
        System.out.print("Title of the Frame- "); 
        String c= sc.next();
        
        myWindow.setSize(a, b);
        myWindow.setTitle(c);
        myWindow.setVisible( true);
    }
}
