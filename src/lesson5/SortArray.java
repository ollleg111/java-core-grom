package lesson5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = {62, 84, 32, 5, 0, 14, 52, 82, 58, 71};

        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr)));


    }

    static int[] sortAscending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    static int[] sortDescending(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        return array;
    }
}
