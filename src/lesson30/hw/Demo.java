package lesson30.hw;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        DepartmentDAO departmentDAO = DepartmentDAO.getInstance();
        EmployeeDAO employeeDAO = EmployeeDAO.getInstance();
        CustomerDAO customerDAO = CustomerDAO.getInstance();
        ProjectDAO projectDAO = ProjectDAO.getInstance();

        Controller controller = new Controller(employeeDAO,departmentDAO, customerDAO,projectDAO);

        Employee employee0 = new Employee("Alex","Sokolov", new Date(),Position.TEAM_LEAD);
        Employee employee1 = new Employee("Igor","Petroff", new Date(),Position.DEVELOPER);
        Employee employee2 = new Employee("Victor","Ivanov", new Date(),Position.DESIGNER);
        Employee employee3 = new Employee("Bob","Sidorov", new Date(),Position.DEVELOPER);

        employeeDAO.add(employee0);
        employeeDAO.add(employee1);
        employeeDAO.add(employee2);
        employeeDAO.add(employee3);

        //employee1.setDepartment();
        //TODO

        Customer customer0 = new Customer("SkyNet");
        Customer customer1 = new Customer("IdSoftware");
        Customer customer2 = new Customer("MMM");
        Customer customer3 = new Customer("WorldOfTanks");

        customerDAO.add(customer0);
        customerDAO.add(customer1);
        customerDAO.add(customer2);
        customerDAO.add(customer3);

        Project project0 = new Project("founding",customer0);
        Project project1 = new Project("geoPositing",customer1);
        Project project2 = new Project("banking",customer2);
        Project project3 = new Project("gameDesigning",customer3);

        projectDAO.add(project0);
        projectDAO.add(project1);
        projectDAO.add(project2);
        projectDAO.add(project3);



    }
}
