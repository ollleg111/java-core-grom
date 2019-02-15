package lesson22.hw1;

import lesson22.hw1.ArrayUtils;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 9, 5, 4};

        System.out.println(ArrayUtils.nCount(array, 4));

        System.out.println(ArrayUtils.maxElement(array));

        System.out.println(Arrays.toString(ArrayUtils.sortAscending(array)));

        System.out.println(Arrays.toString(ArrayUtils.sortDescending(array)));
    }
}
