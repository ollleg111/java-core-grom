package lesson24.exercise;

public class SystemDAO {
    private Sys[] sys = new Sys[5];

    public Sys save(Sys system) {
        int index = 0;
        for (Sys sys1 : sys) {
            if (sys1 == null) {
                sys[index] = system;
                return sys[index];
            }
            index++;
        }
        return null;
    }
}
