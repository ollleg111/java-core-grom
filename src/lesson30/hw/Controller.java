package lesson30.hw;

import java.util.Set;

public class Controller {

    private EmployeeDAO employeeDAO;
    private DepartmentDAO departmentDAO;
    private CustomerDAO customerDAO;
    private ProjectDAO projectDAO;

    public Controller(EmployeeDAO employeeDAO, DepartmentDAO departmentDAO, CustomerDAO customerDAO, ProjectDAO projectDAO) {
        this.employeeDAO = employeeDAO;
        this.departmentDAO = departmentDAO;
        this.customerDAO = customerDAO;
        this.projectDAO = projectDAO;
    }

    public Set<Project> projectsByEmployee(Employee employee) {

        return null;
    }

    public Set<Employee> employessByDeparmentWithoutProjects(DepartmentType departmentType) {

        return employees;
    }

    public Set<Employee> employeesWithoutProject() {

        return employees;
    }

    public Set<Employee> employeesByTeamLead(Employee lead) {

        return employees;
    }

    public Set<Employee> teamLeadsByEmployee(Employee employee) {

        return employees;
    }

    public Set<Employee> employeesByProjectEmployee(Employee employee) {

        return employees;
    }

    public Set<Project> projectsByCustomer(Customer customer) {

        return null;
    }

    public Set<Employee> employeesByCustomerProjects(Customer customer) {

        return employees;
    }

}

