package lesson30.hw;

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

    //TODO BadRequestException ????

    //список сотрудников, работающих над заданным проектом
    public Set<Employee> employeesByProject(String projectName) {
        Set<Employee> result = new HashSet<>();
        System.out.println("List of employees work in the project: " + projectName);
        if (projectName != null) {
            for (Employee emp1 : employeeDAO.getAll()) {
                if (emp1 != null && emp1.getProjects() != null) {
                    for (Project pro : emp1.getProjects()) {
                        if (pro != null && (pro.getName()).equals(projectName))
                            result.add(emp1);
                    }
                }
            }
        }
        return result;
    }

    //список проектов, в которых учавствует заданный сотрудник
    public Set<Project> projectsByEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() +
                " work in the projects: ");
        for (Employee employee1 : employeeDAO.getAll()) {
            if (employee != null && employee1.equals(employee))
                return employee.getProjects();
        }
        return null;
    }

    //список сотрудников из заданного отдела, не учавствующих ни в одном проекте
    public Set<Employee> employeesByDepartmentWithoutProjects(DepartmentType departmentType) {
        Set<Employee> result = new HashSet<>();
        System.out.println("List of employees from department type: " + departmentType +
                ", who do not work in any projects: ");
        for (Employee employee : employeeDAO.getAll()) {
            if (employee != null && employee.getDepartment().getType() == departmentType) {
                if (employee.getProjects().isEmpty()) {
                    result.add(employee);
                }
            }
        }
        return result;
    }

    //список сотрудников, не учавствующих ни в одном проекте
    public Set<Employee> employeesWithoutProject() {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : employeeDAO.getAll()) {
            if (employee != null && employee.getProjects().isEmpty()) {
                result.add(employee);
            }
        }
        return result;
    }

    //список подчиненных для заданного руководителя (по всем проектам, в которых он учавствует)
    public Set<Employee> employeesByTeamLead(Employee lead) {
        Set<Employee> result = new HashSet<>();
        if (lead != null) {
            for (Employee employee : employeeDAO.getAll()) {
                if (employee != null) {
                    for (Project project : employee.getProjects()) {
                        if (project != null && lead.getProjects().contains(project) &&
                                !employee.getPosition().equals(Position.TEAM_LEAD) &&
                                !employee.getPosition().equals(Position.LEAD_DESIGNER))
                            result.add(employee);
                    }
                }
            }
        }
        return result;
    }

    //список руководителей для заданного сотрудника (по всем проектам, в которых он руководит)
    public Set<Employee> teamLeadsByEmployee(Employee employee) {
        Set<Employee> result = new HashSet<>();
        if (employee != null) {
            for (Project project : projectDAO.getAll()) {
                if (project != null) {
                    for (Employee employee1 : employeeDAO.getAll()) {
                        if (employee1 != null && employee1.getProjects().contains(project) &&
                                employee1.getPosition().equals(Position.TEAM_LEAD))
                            result.add(employee1);
                    }
                }
            }
        }
        return result;
    }

    //список сотрудников, учавствующих в тех же проектах, что и заданный сотрудник
    public Set<Employee> employeesByProjectEmployee(Employee employee) {

        return null;
    }

    //список проектов, выполняемых для заданного заказчика
    public Set<Project> projectsByCustomer(Customer customer) {

        return null;
    }

    //список сотрудников, учавствующих в проектах выполняемых для данного заказчика
    public Set<Employee> employeesByCustomerProjects(Customer customer) {

        return null;
    }
}

