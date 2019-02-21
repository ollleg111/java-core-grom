package lesson4;

public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(compareSums(1,3,1,2));
    }

    public static boolean compareSums(int a, int b, int c, int d) {

//        int ab = sum(a,b);
//        Sys.out.println(ab);
//        int cd = sum(c,d);
//        Sys.out.println(cd);
//
//        if(ab>cd) return true;
//        else return false;

        return sum(a,b) > sum(c,d);
    }

    public static long sum(int from, int to) {

        long sumNumbers = 0;

        for (long i = from; i <= to; i++) {

            sumNumbers += i;
        }
        return sumNumbers;
    }
}
