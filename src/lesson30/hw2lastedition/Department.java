package lesson30.hw2lastedition;

import java.util.Collection;
import java.util.Set;

public class Department {
    private DepartmentType type;
    private Set<Employee> employees;

    public Department(DepartmentType type) {
        this.type = type;
    }

    public Department(DepartmentType type, Set<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "type=" + type +
                '}';
    }
}
