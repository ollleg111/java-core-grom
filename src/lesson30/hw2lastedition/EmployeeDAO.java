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

    public static Set<Employee> byProject(String projectName) {
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
        for (Employee employeeFromDAO : instance.getAll()) {
            if (employeeFromDAO.equals(employee))
                return employee.getProjects();
        }
        return null;
    }

    public static Set<Employee> byDepartmentWithoutProjects(DepartmentType departmentType) {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : instance.getAll()) {
            if (employee.getDepartment().getType() == departmentType) {
                result.add(employee);
            }
        }
        return result;
    }

    public static Set<Employee> byTeamLead(Employee lead) {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : instance.getAll()) {
            for (Project project : employee.getProjects()) {
                if (lead.getProjects().contains(project) &&
                        !employee.getPosition().equals(Position.TEAM_LEAD) &&
                        !employee.getPosition().equals(Position.LEAD_DESIGNER))
                    result.add(employee);
            }
        }
        return result;
    }

    public static Set<Employee> byCustomerProjects(Customer customer) {
        Set<Employee> result = new HashSet<>();
        for (Employee employeeFromDAO : instance.getAll()) {
            for (Project project : employeeFromDAO.getProjects()) {
                if (project.getCustomer().equals(customer))
                    result.add(employeeFromDAO);
            }
        }
        return result;
    }

    public static Set<Employee> byProjectEmployee(Employee employee) {
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

    public static Set<Employee> withoutProject() {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : instance.getAll()) {
            if (employee.getProjects().isEmpty()) {
                result.add(employee);
            }
        }
        return result;
    }

    public static Set<Employee> leadsByEmployee(Employee employee) {
        Set<Employee> result = new HashSet<>();
        for (Project project : employee.getProjects()) {
            if (identifyTeamLead(project) != null) {
                result.add(identifyTeamLead(project));
            }
        }
        return result;
    }

    private static Employee identifyTeamLead(Project project) {
        for (Employee employee : instance.employees) {
            if (employee.getProjects().contains(project) &&
                    employee.getPosition().equals(Position.TEAM_LEAD))
                return employee;
        }
        return null;
    }
}
