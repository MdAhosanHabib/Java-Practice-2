package chapter11;

import java.util.Random;
import java.util.Date;

public class No11 {

    public static void main(String[] args) {
        double[] a;
        a = new double[5000];
        Random randomGenerator = new Random();
        for (int i = 0; i < 5000; i++) {
            a[i] = randomGenerator.nextInt(10000);
        }
        ShortingTime ob = new ShortingTime();
        ob.bubble(a);
        ob.selection(a);
    }
}

class ShortingTime {

    Date startTime, endTime;

    public void bubble(double[] data) {
        boolean exchange = true;
        int length = data.length - 2;
        startTime = new Date();
        while (exchange) {
            exchange = false;
            for (int i = 0; i <= length; i++) {
                if (data[i] > data[i + 1]) {
                    double temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    exchange = true;
                }
            }
        }
        endTime = new Date();
        double elapsedTime = endTime.getTime() - startTime.getTime();
        System.out.print("Performances of Bubble Sort: " + elapsedTime);
        System.out.print("\n");
    }

    public void selection(double[] data) {
        int min;
        int lenght = data.length;
        double temp;
        startTime = new Date();
        for (int i = 0; i < lenght - 1; i++) {
            min = i;
            for (int j = i + 1; j < lenght; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        endTime = new Date();
        double elapsedTime = endTime.getTime() - startTime.getTime();
        System.out.print("Performances of Selection Sort: " + elapsedTime);
    }
}
