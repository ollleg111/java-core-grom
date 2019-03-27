package lesson30.hw2lastedition;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

public class Firm {
    private Date dateFounded;
    private Set<Department> departments;
    private Set<Customer> customers;

    public Firm(Date dateFounded, Set<Department> departments, Set<Customer> customers) {
        this.dateFounded = dateFounded;
        this.departments = departments;
        this.customers = customers;
    }

    public Date getDateFounded() {
        return dateFounded;
    }

    public Collection<Department> getDepartments() {
        return departments;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "dateFounded=" + dateFounded +
                '}';
    }
}
