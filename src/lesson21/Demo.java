package lesson21;

public class Demo {
    public static void main(String[] args) throws Exception {

        Company company = new Company(100, "Nokia");

        Company.setLicence("ncdnkl");

        System.out.println(company.getLicence());

        Company company1 = new Company(9, "Demo");

        System.out.println(company1.getLicence());

        Company.setLicence("sdASWDS");

        System.out.println(company.getLicence());
        System.out.println(company1.getLicence());

//        Company.validate();

        //demo utils

        //ArrayUtils arrayUtils = new ArrayUtils();
        int min = ArrayUtils.minElement(new int[]{1, 10, 40});

    }
}
