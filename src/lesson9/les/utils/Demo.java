package lesson9.les.utils;

import lesson9.les.utils.Company;

public class Demo {
    public static void main(String[] args) {

        Company company = new Company("Oleg","UK");
//        Sys.out.println(company.countryFounded);
//        Sys.out.println(company.name);
        System.out.println(company.getName());
        System.out.println(company.getCountryFounded());

//        company.name = "IBM";

//        Checker checker = new Checker();
//        Sys.out.println(checker.chechCompanyName(company.name));
//        Sys.out.println(checker.companyNamesValidatedCount);

    }
}
