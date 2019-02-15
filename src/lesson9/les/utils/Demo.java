package lesson9.les.utils;

import lesson9.les.utils.Company;

public class Demo {
    public static void main(String[] args) {

        Company company = new Company("Oleg","UK");
//        System.out.println(company.countryFounded);
//        System.out.println(company.name);
        System.out.println(company.getName());
        System.out.println(company.getCountryFounded());

//        company.name = "IBM";

//        Checker checker = new Checker();
//        System.out.println(checker.chechCompanyName(company.name));
//        System.out.println(checker.companyNamesValidatedCount);

    }
}
