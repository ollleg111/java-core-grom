package lesson30.hw;

import java.util.Set;
import java.util.TreeSet;

public class CustomerDAO {
    Set<Customer> customers = new TreeSet<>();

    public CustomerDAO(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerDAO{" +
                "customers=" + customers +
                '}';
    }
}
