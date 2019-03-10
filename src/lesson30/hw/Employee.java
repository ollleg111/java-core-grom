package lesson30.hw;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Employee {
    private String firstName;
    private String lastName;
    private Date dateHired;
    private Position position;
    private Department department;
    private Set<Project> projects = new HashSet<>();

    public Employee(String firstName, String lastName, Date dateHired, Position position,
                    Department department, Set<Project> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateHired = dateHired;
        this.position = position;
        this.department = department;
        this.projects = projects;
    }

    public Employee(String firstName, String lastName, Date dateHired, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateHired = dateHired;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    //TODO
    public void setDepartment(Department department) {
        if (department != null) {
            this.department = department;
        }
    }

    //TODO
    public void setProject(Project project) {
        if (project != null) {
            this.projects.add(project);
        }
    }
//
//    public void setProjects(Set<Project> projects) {
//        this.projects = projects;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateHired=" + dateHired +
                ", position=" + position +
                ", department=" + department +
                ", projects=" + projects +
                '}';
    }
}
