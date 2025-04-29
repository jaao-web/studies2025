package ex008arrays;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int length = array.length -1;
        int temp;
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[(length - i)];
            array[(length - i)] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
