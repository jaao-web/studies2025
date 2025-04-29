package ex008arrays;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos elementos vai introduzir: ");
        value = scanner.nextInt();
        return value;
    }

    private static int[] readElements(int value) {
        int[] array = new int[value];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o numero da posição " + (i) + "do array: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
