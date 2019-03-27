package lesson30.hw2lastedition;

import java.util.HashSet;
import java.util.Set;

public class DepartmentDAO {

    private static DepartmentDAO instance;

    public static DepartmentDAO getInstance() {
        if (instance == null) {
            instance = new DepartmentDAO();
        }
        return instance;
    }

    private DepartmentDAO() {
        for (DepartmentType departmentType : DepartmentType.values())
            getAll().add(new Department(departmentType));
    }

    public Department getDepartmentByType(DepartmentType departmentType) {
        for (Department department : getAll()) {
            if (department.getType() == departmentType)
                return department;
        }
        return null;
    }

    private Set<Department> departments = new HashSet<>();

    public Set<Department> getAll() {
        return departments;
    }
}
