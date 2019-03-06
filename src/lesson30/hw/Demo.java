package lesson30.hw;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {

        DepartmentDAO departmentDAO = DepartmentDAO.getInstance();
        EmployeeDAO employeeDAO = EmployeeDAO.getInstance();
        CustomerDAO customerDAO = CustomerDAO.getInstance();
        ProjectDAO projectDAO = ProjectDAO.getInstance();

        Controller controller = new Controller(employeeDAO, departmentDAO, customerDAO, projectDAO);

        Employee employee0 = new Employee("Alex", "Sokolov", new Date(), Position.TEAM_LEAD);
        Employee employee1 = new Employee("Igor", "Petroff", new Date(), Position.DEVELOPER);
        Employee employee2 = new Employee("Victor", "Ivanov", new Date(), Position.DESIGNER);
        Employee employee3 = new Employee("Bob", "Sidorov", new Date(), Position.DEVELOPER);
        Employee employee4 = new Employee("Anna", "Sidorova", new Date(), Position.DEVELOPER);
        Employee employee5 = new Employee("Svetlana", "Fedorova", new Date(), Position.DEVELOPER);
        Employee employee6 = new Employee("Ivan", "Fedorov", new Date(), Position.TEAM_LEAD);
        Employee employee7 = new Employee("Ivan", "Ivanov", new Date(), Position.DESIGNER);
        Employee employee8 = new Employee("Ivan", "Petrov", new Date(), Position.DESIGNER);
        Employee employee9 = new Employee("Stepan", "Kruchkov", new Date(), Position.FINANCE);
        Employee employee10 = new Employee("Arni", "Suleymanov", new Date(), Position.MANAGER);
        Employee employee11 = new Employee("Konstantin", "Barabanov", new Date(), Position.MANAGER);
        Employee employee12 = new Employee("Boris", "Li", new Date(), Position.MANAGER);
        Employee employee13 = new Employee("Alex", "Han", new Date(), Position.ANALYST);
        Employee employee14 = new Employee("Nikolay", "Sidorchuk", new Date(), Position.ANALYST);

        employeeDAO.add(employee0);
        employeeDAO.add(employee1);
        employeeDAO.add(employee2);
        employeeDAO.add(employee3);

        Customer customer0 = new Customer("SkyNet");
        Customer customer1 = new Customer("IdSoftware");
        Customer customer2 = new Customer("MMM");
        Customer customer3 = new Customer("WorldOfTanks");

        customerDAO.add(customer0);
        customerDAO.add(customer1);
        customerDAO.add(customer2);
        customerDAO.add(customer3);

        Project project0 = new Project("founding", customer0);
        Project project1 = new Project("geoPositing", customer1);
        Project project2 = new Project("banking", customer2);
        Project project3 = new Project("gameDesigning", customer3);

        projectDAO.add(project0);
        projectDAO.add(project1);
        projectDAO.add(project2);
        projectDAO.add(project3);

        Collection<Employee> employeesDevelopers = new HashSet<>();
        employeesDevelopers.add(employee0);
        employeesDevelopers.add(employee1);
        employeesDevelopers.add(employee3);
        employeesDevelopers.add(employee4);
        employeesDevelopers.add(employee5);
        employeesDevelopers.add(employee6);

        Collection<Employee> employeesDesigne = new HashSet<>();
        employeesDesigne.add(employee7);
        employeesDesigne.add(employee8);

        Collection<Employee> employeesFinance = new HashSet<>();
        employeesFinance.add(employee9);

        Collection<Employee> employeesManage = new HashSet<>();
        employeesManage.add(employee10);
        employeesManage.add(employee11);
        employeesManage.add(employee12);

        Collection<Employee> employeesAnalyst = new HashSet<>();
        employeesManage.add(employee13);
        employeesManage.add(employee14);

        Department depDevelop = new Department(DepartmentType.DEVELOPMENT, employeesDevelopers);
        Department depDesign = new Department(DepartmentType.DESIGN, employeesDesigne);
        Department depFinance = new Department(DepartmentType.FINANCE, employeesFinance);
        Department depManage = new Department(DepartmentType.MANAGER, employeesManage);
        Department depAnalyst = new Department(DepartmentType.ANALYST, employeesAnalyst);
        departmentDAO.add(depDevelop);
        departmentDAO.add(depDesign);
        departmentDAO.add(depFinance);
        departmentDAO.add(depManage);
        departmentDAO.add(depAnalyst);


        System.out.println(controller.employeesByProject("founding"));


    }
}
