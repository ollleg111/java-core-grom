package lesson30.hw;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Firm firm = (Firm) o;

        return dateFounded.equals(firm.dateFounded);
    }

    @Override
    public int hashCode() {
        return dateFounded.hashCode();
    }

    @Override
    public String toString() {
        return "Firm{" +
                "dateFounded=" + dateFounded +
                '}';
    }
}
