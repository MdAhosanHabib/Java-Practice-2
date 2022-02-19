package chapter11;

import java.util.Scanner;

public class No08 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numberOfString = 0;
        System.out.print("Number of String (N Words): ");
        numberOfString = inputScanner.nextInt();
        String[] a;
        a = new String[numberOfString];
        System.out.println("Enter String (Values): ");
        for (int i = 0; i < a.length; i++) {
            a[i] = inputScanner.next();
        }
        SelectionBubbleShort ob = new SelectionBubbleShort();
        ob.bubble(a);
        ob.selection(a);
        inputScanner.close();
    }
}

class SelectionBubbleShort {

    public void bubble(String[] data) {
        boolean exchange = true;
        int length = data.length - 2;
        while (exchange) {
            exchange = false;
            for (int i = 0; i <= length; i++) {
                if (data[i + 1].compareTo(data[i]) < 0) {
                    String temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    exchange = true;
                }
            }
        }
        System.out.print("Sorted Data using Bubble Short: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
    }

    public void selection(String[] data) {
        int min;
        int lenght = data.length;
        String temp;
        for (int i = 0; i < lenght - 1; i++) {
            min = i;
            for (int j = i + 1; j < lenght; j++) {
                if (data[j].compareTo(data[min]) < 0) {
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        System.out.print("Sorted Data using Selection Short: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
