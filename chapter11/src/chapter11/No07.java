package chapter11;

public class No07 {

    public static void main(String[] args) {
        boolean exchange = true;
        String[] input = {"a", "g", "c", "h", "z", "k"};
        int length = input.length - 2;
        while (exchange) {
            exchange = false;
            for (int i = 0; i <= length; i++) {
                if (input[i + 1].compareTo(input[i]) < 0) {
                    String temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    exchange = true;
                }
            }
        }
        System.out.println("Sorted String Data using Bubble Sort: ");
        for (int i = 0; i <= length + 1; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
