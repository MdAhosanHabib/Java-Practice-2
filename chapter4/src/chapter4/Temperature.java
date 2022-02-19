package chapter4;
import java.util.Scanner;

public class Temperature {
    private float setFahrenheit;
    private float setCelsius;

    public float Temperature(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input temperature in degrees Fahrenheit: ");
        this.setFahrenheit = scan.nextFloat();
        this.setCelsius = ((setFahrenheit-32)*5)/9;
        return setCelsius;
    }

}
