package lesson26.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println(useList().toString());
    }

    public static ArrayList<Order> useList() {
        ArrayList<Order> list = new ArrayList<>();

        Order order0 = new Order(100, 100, "UAH", "aaa", "a0");
        Order order1 = new Order(101, 100, "USD", "bbb", "a1");
        Order order2 = new Order(102, 100, "GBP", "ccc", "a2");
        Order order3 = new Order(103, 100, "UCD", "ddd", "a3");
        Order order4 = new Order(104, 100, "RUR", "eee", "a4");

        list.add(order0);
        list.add(order1);
        list.add(order2);
        System.out.println(list.toString());

        list.add(3, order3);
        System.out.println(list.toString());

        list.remove(3);
        System.out.println(list.toString());

        list.remove(order2);
        System.out.println(list.toString());

        ArrayList<Order> list1 = new ArrayList<>();

        list1.add(order0);
        list1.add(order1);
        list1.add(order2);

        list.addAll(list1);
        System.out.println(list.toString());

        System.out.println(list.subList(0, 3));

        list.set(0, order4);
        System.out.println(list.toString());

        System.out.println(list.contains(order4));

        Object[] o = list.toArray();
        System.out.println(Arrays.toString(o));

        list.clear();
        System.out.println(list);

        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        
        return list;
    }
}
