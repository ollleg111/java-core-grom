package lesson9.les.utils;

public class Checker {

    private int companyNamesValidatedCount = 4;

    public boolean chechCompanyName(String companyName) {
//        if (companyName == "Google" || companyName == "Amazon")
//            return false;
//        else return true;

        if (companyNamesValidatedCount > 10)
            return false;

        return companyName != "Google" && companyName != "Amazon";
    }
}
