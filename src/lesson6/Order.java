package lesson6;

import java.util.Date;

public class Order {

    public static void main(String[] args) {

        Order order = new Order();

        System.out.println(order.confirmOrder());
        System.out.println(order.checkPrice());
        System.out.println(order.isValidType());
        System.out.println(order.dateConfirmed);

    }

    public long id;
    public int price;
    public Date dateCreated;
    public boolean isConfirmed;
    public Date dateConfirmed;
    public String city;
    public String country;
    public String type;

    public Order() {
    }

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public boolean confirmOrder() {

        if (!isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }
        return isConfirmed;
    }

    public boolean checkPrice() {

        if (price > 1000)
            return true;
        else return false;
    }

    public boolean isValidType() {

        if (type == "Buy" || type == "Sale")
            return true;
        else return false;
    }
}
