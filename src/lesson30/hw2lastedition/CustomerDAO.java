package lesson30.hw2lastedition;


import java.util.HashSet;
import java.util.Set;

public class CustomerDAO {

    private static CustomerDAO instance;

    public static CustomerDAO getInstance() {
        if (instance == null) {
            instance = new CustomerDAO();
        }
        return instance;
    }

    private Set<Customer> customers = new HashSet<>();

    public Customer add(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Set<Customer> getAll() {
        return customers;
    }
}
