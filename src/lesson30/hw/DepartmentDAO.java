package lesson30.hw;

public class DepartmentDAO extends GeneralDAO<Department> {

    private static DepartmentDAO instance;

    public static DepartmentDAO getInstance() {
        if (instance == null) {
            instance = new DepartmentDAO();
        }
        return instance;
    }

    //TODO
    private DepartmentDAO() {
        for (DepartmentType departmentType : DepartmentType.values())
            getAll().add(new Department(departmentType));
    }

    //TODO
    public Department getDepartmentByType(DepartmentType departmentType) {
        for (Department department : getAll()) {
            if (department.getType() == departmentType)
                return department;
        }
        return null;
    }
}
