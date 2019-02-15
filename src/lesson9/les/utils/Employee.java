package lesson9.les.utils;

import lesson9.les.utils.Company;

public class Employee {

    public String name;
    public Company company;
    public int monthlySalary;

    public Employee(String name, Company company, int monthlySalary) {
        this.name = name;
        this.company = company;
        this.monthlySalary = monthlySalary;
    }
}
