package chapter4;
import java.util.Scanner;

public class Temperature1 {
    private float setFahrenheit;
    private float setCelsius;

    public float Temperature(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input temperature in degrees Celsius: ");
        this.setCelsius = scan.nextFloat();
        this.setFahrenheit = ((setCelsius*9)/5)+32;
        return setFahrenheit;
    }
}
