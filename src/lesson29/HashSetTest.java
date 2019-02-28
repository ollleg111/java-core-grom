package lesson29;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        System.out.println(useHashSet());
    }

    public static HashSetTest useHashSet() {
        HashSet<Order> list = new HashSet<>();

        Order order0 = new Order(100, 100, "UAH", "aaa", "a0");
        Order order1 = new Order(101, 100, "USD", "bbb", "a1");
        Order order2 = new Order(102, 100, "GBP", "ccc", "a2");
        Order order3 = new Order(103, 100, "UCD", "ddd", "a3");
        Order order4 = new Order(104, 100, "RUR", "eee", "a4");



        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);

        System.out.println(list.toString());



        list.remove(order0);
        System.out.println(list.toString());



        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);

        return null;
    }
}
