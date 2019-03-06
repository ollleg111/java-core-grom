package lesson30.hw;


public class ProjectDAO extends GeneralDAO<Project>{

    private static ProjectDAO instance;

    public static ProjectDAO getInstance(){

        if(instance == null){
            instance = new ProjectDAO();
        }
        return instance;
    }
}
