package lesson30.hw;

import java.util.HashSet;

public class Controller {

    private HashSet<Employee> employees;
    private HashSet<Project> projects;
    private HashSet<Customer> customers;

    public Controller(HashSet<Employee> employees, HashSet<Project> projects, HashSet<Customer> customers) {
        this.employees = employees;
        this.projects = projects;
        this.customers = customers;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public HashSet<Project> getProjects() {
        return projects;
    }

    public HashSet<Customer> getCustomers() {
        return customers;
    }

    public HashSet<Employee> employeesByProject(String projectName) {

        return employees;
    }

    public HashSet<Project> projectsByEmployee(Employee employee) {

        return projects;
    }

    public HashSet<Employee> employessByDeparmentWithoutProjects(DepartmentType departmentType) {

        return employees;
    }

    public HashSet<Employee> employeesWithoutProject() {

        return employees;
    }

    public HashSet<Employee> employeesByTeamLead(Employee lead) {

        return employees;
    }

    public HashSet<Employee> teamLeadsByEmployee(Employee employee) {

        return employees;
    }

    public HashSet<Employee> employeesByProjectEmployee(Employee employee) {

        return employees;
    }

    public HashSet<Project> projectsByCustomer(Customer customer) {

        return projects;
    }

    public HashSet<Employee> employeesByCustomerProjects(Customer customer) {

        return employees;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "employees=" + employees +
                ", projects=" + projects +
                ", customers=" + customers +
                '}';
    }
}

