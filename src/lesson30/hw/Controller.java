package lesson30.hw;

import java.util.Set;
import java.util.TreeSet;

public class Controller {

    public Set<Employee> employees = new TreeSet<>();


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

