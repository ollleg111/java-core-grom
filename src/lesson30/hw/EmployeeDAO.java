package lesson30.hw;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeDAO {
    private Set<Employee> employees = new TreeSet<>();

    public EmployeeDAO(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeeDAO{" +
                "employees=" + employees +
                '}';
    }
}
