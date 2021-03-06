package lesson30.hw2lastedition;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {

    private static EmployeeDAO instance;

    public static EmployeeDAO getInstance() {

        if (instance == null) {
            instance = new EmployeeDAO();
        }
        return instance;
    }

    private Set<Employee> employees = new HashSet<>();

    public Employee add(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public Set<Employee> getAll() {
        return employees;
    }

    public static Set<Employee> employeesByProject(String projectName) {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : instance.getAll()) {
            for (Project pro : employee.getProjects()) {
                if (pro.getName().equals(projectName))
                    result.add(employee);
            }
        }
        return result;
    }

    public static Set<Project> projectsByEmployee(Employee employee) {
        return employee.getProjects();
    }

    public static Set<Employee> employeesByDepartmentWithoutProjects(DepartmentType departmentType) {
        Set<Employee> result = new HashSet<>();
        for (Department department : DepartmentDAO.getInstance().getAll()) {
            if (department.getType().equals(departmentType)) {
                for (Employee employee : instance.getAll()) {
                    if (employee.getProjects().isEmpty() &&
                            employee.getDepartment().getType().equals(departmentType))
                        result.add(employee);
                }
            }
        }
        return result;
    }

    public static Set<Employee> employeesByTeamLead(Employee lead) {
        Set<Employee> result = new HashSet<>();
        if (lead.getPosition().equals(Position.TEAM_LEAD))
            result.addAll(employeesByProjectEmployee(lead));
        return result;
    }

    public static Set<Employee> employeesByCustomerProjects(Customer customer) {
        Set<Employee> result = new HashSet<>();
        for (Employee employeeFromDAO : instance.getAll()) {
            for (Project project : employeeFromDAO.getProjects()) {
                if (project.getCustomer().equals(customer))
                    result.add(employeeFromDAO);
            }
        }
        return result;
    }

    public static Set<Employee> employeesByProjectEmployee(Employee employee) {
        Set<Employee> result = new HashSet<>();
        for (Employee employeeFromDAO : instance.getAll()) {
            for (Project project : employeeFromDAO.getProjects()) {
                if (employee.getProjects().contains(project))
                    result.add(employeeFromDAO);
            }
            result.remove(employee);
        }
        return result;
    }

    public static Set<Employee> employeesWithoutProject() {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : instance.getAll()) {
            if (employee.getProjects().isEmpty()) {
                result.add(employee);
            }
        }
        return result;
    }

    public static Set<Employee> teamLeadsByEmployee(Employee employee) {
        Set<Employee> result = new HashSet<>();
        for (Project project : employee.getProjects()) {
            if (identifyTeamLead(project) != null) {
                result.add(identifyTeamLead(project));
            }
        }
        return result;
    }

    private static Employee identifyTeamLead(Project project) {
        for (Employee employee : instance.getAll()) {
            if (employee.getProjects().contains(project) &&
                    employee.getPosition().equals(Position.TEAM_LEAD))
                return employee;
        }
        return null;
    }
}
