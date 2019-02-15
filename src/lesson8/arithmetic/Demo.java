package lesson8.arithmetic;

public class Demo {
    public static void main(String[] args) {

        int[] test = {10, 11, 47, 55, 100, 99, 5, -5, 0};

        Adder adder = new Adder();
        System.out.println(adder.check(test));
        System.out.println(adder.add(20,50));

    }
}
