package lesson30.hw2lastedition;

import java.util.HashSet;
import java.util.Set;

public class Controller {

    private EmployeeDAO employeeDAO;
    private DepartmentDAO departmentDAO;
    private CustomerDAO customerDAO;
    private ProjectDAO projectDAO;

    public Controller(EmployeeDAO employeeDAO, DepartmentDAO departmentDAO, CustomerDAO customerDAO,
                      ProjectDAO projectDAO) {
        this.employeeDAO = employeeDAO;
        this.departmentDAO = departmentDAO;
        this.customerDAO = customerDAO;
        this.projectDAO = projectDAO;
    }

    //список сотрудников, работающих над заданным проектом
    public Set<Employee> employeesByProject(String projectName) {
        return EmployeeDAO.byProject(projectName);
    }

    //список проектов, в которых учавствует заданный сотрудник
    public Set<Project> projectsByEmployee(Employee employee) {
        return EmployeeDAO.projectsByEmployee(employee);
    }

    //список сотрудников из заданного отдела, не учавствующих ни в одном проекте
    public Set<Employee> employeesByDepartmentWithoutProjects(DepartmentType departmentType) {
        return EmployeeDAO.byDepartmentWithoutProjects(departmentType);
    }

    //список сотрудников, не учавствующих ни в одном проекте
    public Set<Employee> employeesWithoutProject() {
        return EmployeeDAO.withoutProject();
    }

    //список подчиненных для заданного руководителя (по всем проектам, в которых он учавствует)
    public Set<Employee> employeesByTeamLead(Employee lead) {
        return EmployeeDAO.byTeamLead(lead);
    }

    //список руководителей для заданного сотрудника (по всем проектам, в которых он руководит)
    public Set<Employee> teamLeadsByEmployee(Employee employee) {
        return EmployeeDAO.leadsByEmployee(employee);
    }

    //список сотрудников, учавствующих в тех же проектах, что и заданный сотрудник
    public Set<Employee> employeesByProjectEmployee(Employee employee) {
        return EmployeeDAO.byProjectEmployee(employee);
    }

    //список проектов, выполняемых для заданного заказчика
    public Set<Project> projectsByCustomer(Customer customer) {
        return ProjectDAO.byCustomer(customer);
    }

    //список сотрудников, учавствующих в проектах выполняемых для данного заказчика
    public Set<Employee> employeesByCustomerProjects(Customer customer) {
        return EmployeeDAO.byCustomerProjects(customer);
    }
}

