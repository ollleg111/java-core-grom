package lesson30.hw;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
        employeeDAO.add(employee4);
        employeeDAO.add(employee5);
        employeeDAO.add(employee6);
        employeeDAO.add(employee7);
        employeeDAO.add(employee8);
        employeeDAO.add(employee9);
        employeeDAO.add(employee10);
        employeeDAO.add(employee11);
        employeeDAO.add(employee12);
        employeeDAO.add(employee13);
        employeeDAO.add(employee14);

//        for (Employee employee : EmployeeDAO.getInstance().getAll()) {
//            System.out.println(employee);
//        }
//        System.out.println("____________________________________________________________________________________");

        employee0.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DEVELOPMENT));
        employee1.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DEVELOPMENT));
        employee3.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DEVELOPMENT));
        employee4.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DEVELOPMENT));
        employee5.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DEVELOPMENT));
        employee6.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DEVELOPMENT));

        employee2.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DESIGN));
        employee7.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DESIGN));
        employee8.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.DESIGN));

        employee9.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.FINANCE));

        employee10.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.MANAGER));
        employee11.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.MANAGER));
        employee12.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.MANAGER));

        employee13.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.ANALYST));
        employee14.setDepartment(departmentDAO.getDepartmentByType(DepartmentType.ANALYST));

        Customer customer0 = new Customer("SkyNet");
        Customer customer1 = new Customer("IdSoftware");
        Customer customer2 = new Customer("MMM");
        Customer customer3 = new Customer("WorldOfTanks");

        customerDAO.add(customer0);
        customerDAO.add(customer1);
        customerDAO.add(customer2);
        customerDAO.add(customer3);

//        for (Customer customer : CustomerDAO.getInstance().getAll()) {
//            System.out.println(customer.getName());
//        }
//        System.out.println("____________________________________________________________________________________");

        Project project0 = new Project("founding", customer0);
        Project project1 = new Project("geoPositing", customer1);
        Project project2 = new Project("banking", customer2);
        Project project3 = new Project("gameDesigning", customer3);

        projectDAO.add(project0);
        projectDAO.add(project1);
        projectDAO.add(project2);
        projectDAO.add(project3);

        employee0.addProject(project3);
        employee1.addProject(project3);
        employee3.addProject(project3);

        employee6.addProject(project0);
        employee1.addProject(project0);
        employee4.addProject(project0);
        employee5.addProject(project0);

        for(Employee employee: EmployeeDAO.getInstance().getAll()){
            System.out.println(employee.toString());
        }

        System.out.println("____________________________________________________________________________________");

        for (Employee employee : controller.employeesByProject("founding")) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("____________________________________________________________________________________");

    }
}
