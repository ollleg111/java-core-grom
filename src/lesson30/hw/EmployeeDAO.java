package lesson30.hw;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO extends GeneralDAO<Employee> {

    private static EmployeeDAO instance;

    public static EmployeeDAO getInstance() {

        if (instance == null) {
            instance = new EmployeeDAO();
        }
        return instance;
    }

    public Set<Employee> getListEmployessFromProject(String project) {
        Set<Employee> res = new HashSet<>();
        for (Employee empl : getAll()) {
            if (empl != null) {
                
            }
        }
        return res;
    }


    //TODO
}
