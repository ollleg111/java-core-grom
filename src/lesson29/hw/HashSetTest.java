package lesson29.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {

        System.out.println(useHashSet().toString());
    }

    public static HashSet useHashSet() {
        HashSet<Order> list = new HashSet<>();

        Order order0 = new Order(100, 2700, "UAH", "aaa", "a0");
        Order order1 = new Order(101, 100, "USD", "bbb", "a1");
        Order order2 = new Order(102, 80, "GBP", "ccc", "a2");
        Order order3 = new Order(103, 130, "CAD", "ddd", "a3");
        Order order4 = new Order(104, 4000, "RUR", "eee", "a4");
        Order order5 = new Order(105, 4000000, "ZBD", "fff", "z0");

        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);

        System.out.println(list.toString());

        for (Order order : list) {
            System.out.println(order.toString());
        }

        list.remove(order0);
        System.out.println(list.toString());

        System.out.println("________________________________________remove___________________________________");

        for (Order order : list) {
            System.out.println(order.toString());
        }

        Object[] object = list.toArray();
        System.out.println("!!  " + Arrays.toString(object));
        System.out.println("________________________________________toArray__________________________________");



        System.out.println(list.size() + " elements in HashSetList");

        System.out.println("________________________________________size_____________________________________");

        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
//
//        for (Ord order : list) {
//            System.out.println(order.toString());
//        }

        HashSet<Order> retainAllList = new HashSet<>();

        retainAllList.add(order2);
        retainAllList.add(order3);
        retainAllList.add(order5);

        list.retainAll(retainAllList);

        Iterator<Order> orderIterator = list.iterator();

        while (orderIterator.hasNext()) {
            System.out.println(orderIterator.next().toString());
        }

        System.out.println("________________________________________retainAll________________________________");

        list.add(order0);
        list.add(order1);
        list.add(order4);

        return list;
    }
}
