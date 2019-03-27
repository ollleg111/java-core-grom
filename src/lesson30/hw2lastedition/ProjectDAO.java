package lesson30.hw2lastedition;

import java.util.HashSet;
import java.util.Set;

public class ProjectDAO {

    private static ProjectDAO instance;

    public static ProjectDAO getInstance() {

        if (instance == null) {
            instance = new ProjectDAO();
        }
        return instance;
    }

    private Set<Project> projects = new HashSet<>();

    public Project add(Project project) {
        projects.add(project);
        return project;
    }

    public Set<Project> getAll() {
        return projects;
    }

    public static Set<Project> byCustomer(Customer customer) {
        Set<Project> result = new HashSet<>();
        for (Project project : getInstance().getAll()) {
            if (project.getCustomer().equals(customer))
                result.add(project);
        }
        return result;
    }
}
