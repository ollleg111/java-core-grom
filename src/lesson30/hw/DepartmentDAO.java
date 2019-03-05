package lesson30.hw;

import java.util.Set;
import java.util.TreeSet;

public class DepartmentDAO {
    Set<Department> departments = new TreeSet<>();

    public DepartmentDAO(Set<Department> departments) {
        this.departments = departments;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "DepartmentDAO{" +
                "departments=" + departments +
                '}';
    }
}
