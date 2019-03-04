package lesson30.task1;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numbersOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numbersOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 100;
        return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR)
            return 5000;
        return 10000;
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.USD)
            return .01;
        else
            return 0;
    }

    @Override
    public double getCommission(int amount) {
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return .03;
            else
                return .05;
        } else {
            if (amount <= 1000)
                return .1;
            else
                return .11;
        }
    }
}
