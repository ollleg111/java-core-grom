package lesson5;

public class Unique {
    public static void main(String[] args) {

        int[] newArray = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(newArray));

    }

    public static int uniqueCount(int[] array) {

//        int count = 0;
//        for (int i = 0; i <array.length ; i++) {
//            if()
//                count++;
//        }
//
//
//        return count;

        int[] copy = new int[array.length];
        int res = 0;
        int countNum = 0;
        int count = 0;

        for (int i = 0; i < copy.length; i++) {
            copy[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (copy[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        copy[j] = 1;
                        count++;
                    }
                }
            }
            if (countNum < count) {
                countNum = count;
                res++;
            }
        }
        return res;
    }
}
