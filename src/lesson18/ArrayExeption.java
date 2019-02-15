package lesson18;

public class ArrayExeption {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 0};

        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println("element was not found");
        }

        System.out.println("Cool....");

        System.out.println("Cool2....");

    }
}
