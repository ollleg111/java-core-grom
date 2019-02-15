package lesson21;

public class Company {
    private int numberOfEmployees;
    private String name;
    private static String licence;

    private static int maxNumberofEmpoyess = 100;

    static {
        System.out.println("code block is called");
        init();
    }

    public Company(int numberOfEmployees, String name) throws Exception {

        if (numberOfEmployees > maxNumberofEmpoyess)
            throw new Exception("Company can have max " + maxNumberofEmpoyess + " employees");
        this.numberOfEmployees = numberOfEmployees;
        this.name = name;
    }

    private static void init() {
        maxNumberofEmpoyess = 100;
    }

    public static void validate() throws Exception {
        if (!licence.equals("TTlksnkln"))
            throw new Exception("Wrong licence" + licence);


    }

    public static void setLicence(String licence) {
        Company.licence = licence;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public String getLicence() {
        return licence;
    }

    private static class Test {


    }
}
