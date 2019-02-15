package lesson22.hw1;

public class ArrayUtils {

    public static int maxElement(int[] array) {
        int max = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;

        for (int el : array) {
            if (el == n)
                count++;
        }
        return count;
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

//    public static int []sortAscending(int[] arr) {
//        int n = arr.length;
//        int temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - 1); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//    public static int[] sortDescending(int[] arr) {
//        int n = arr.length;
//        int temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - 1); j++) {
//                if (arr[j - 1] < arr[j]) {
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }
}
