package chapter11;

public class No06 {

    public static void main(String[] args) {
        String[] input = {"a", "g", "c", "h", "z", "k"};
        int min;
        int lenght = input.length;
        String temp;
        for (int i = 0; i < lenght - 1; i++) {
            min = i;
            for (int j = i + 1; j < lenght; j++) {
                if (input[j].compareTo(input[min]) < 0) {
                    min = j;
                }
            }
            temp = input[min];
            input[min] = input[i];
            input[i] = temp;
        }
        System.out.println("Sorted String Data: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
