package practice;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Level1_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        JFrame myWindow = new JFrame( );
        
        System.out.print("Enter Last Name- ");
        String a= sc.next();
        System.out.print("Enter Fisrt Name- "); 
        String b= sc.next();
        
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setLayout(new BorderLayout());
        myWindow.add(new JLabel(b+" "+a), BorderLayout.CENTER);
        
        myWindow.setSize(800, 600);
        myWindow.setTitle( "Welcome to Java" );
        myWindow.setVisible( true);
    }
}
