package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {
        DemoHomeWork homeWork = new DemoHomeWork();
        homeWork.createOrder();
        homeWork.createOrderAndCallMethods();


        System.out.println(homeWork.createOrder().price);
        System.out.println(homeWork.createOrder().dateCreated);
        System.out.println(homeWork.createOrder().isConfirmed);
        System.out.println(homeWork.createOrder().dateConfirmed);
        System.out.println(homeWork.createOrder().city);
        System.out.println(homeWork.createOrder().country);
        System.out.println(homeWork.createOrder().type);

        System.out.println("");

        System.out.println(homeWork.createOrder().confirmOrder());
        System.out.println(homeWork.createOrder().checkPrice());
        System.out.println(homeWork.createOrder().isValidType());

        System.out.println("");

        System.out.println(homeWork.createOrderAndCallMethods().price);
        System.out.println(homeWork.createOrderAndCallMethods().dateCreated);
        System.out.println(homeWork.createOrderAndCallMethods().isConfirmed);
        System.out.println(homeWork.createOrderAndCallMethods().dateConfirmed);
        System.out.println(homeWork.createOrderAndCallMethods().city);
        System.out.println(homeWork.createOrderAndCallMethods().country);
        System.out.println(homeWork.createOrderAndCallMethods().type);

        System.out.println("");

        System.out.println(homeWork.createOrderAndCallMethods().confirmOrder());
        System.out.println(homeWork.createOrderAndCallMethods().checkPrice());
        System.out.println(homeWork.createOrderAndCallMethods().isValidType());
    }


    public Order createOrder() {

        return new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
    }

    public Order createOrderAndCallMethods() {


        Order otherOrder = new Order();
        otherOrder.price = 100;
        otherOrder.dateCreated = new Date();
        otherOrder.isConfirmed = true;
        otherOrder.dateConfirmed = new Date();
        otherOrder.city = "Kiev";
        otherOrder.country = "Ukraine";
        otherOrder.type = "SomeValue";

        otherOrder.confirmOrder();
        otherOrder.checkPrice();
        otherOrder.isValidType();

        return otherOrder;
    }
}
