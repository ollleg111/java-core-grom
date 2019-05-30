package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Order;

import java.util.ArrayList;

public class OrderDAO extends GeneralDAO<Order> {

    @Override
    public void setPath(String path) {
        setPath(Constants.ORDER_DB_PATH);
    }

    @Override
    public ArrayList<Order> getAll() {
        return super.getAll();
    }

    @Override
    public Order findById(long id) {
        return super.findById(id);
    }

    @Override
    public Order find(Order order) {
        return super.find(order);
    }

    @Override
    public void remove(Order order) throws Exception {
        super.remove(order);
    }

    @Override
    public Order create(Order order) throws Exception {
        //TODO
        return super.create(order);
    }

    @Override
    public boolean isExistObject(Order order) {
        //TODO
        return super.isExistObject(order);
    }

    @Override
    public Order map(String obj) {
        //TODO
        return null;
    }

    @Override
    public String reverseMap(Order obj) {
        //TODO
        return null;
    }
}
