package lesson30.hw;

import java.util.Set;
import java.util.TreeSet;

public class ProjectDAO {
    private Set<Project> projects = new TreeSet<>();

    public ProjectDAO(Set<Project> projects) {
        this.projects = projects;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "ProjectDAO{" +
                "projects=" + projects +
                '}';
    }
}
