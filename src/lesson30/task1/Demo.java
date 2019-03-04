package lesson30.task1;

public class Demo {

    public static void main(String[] args) {

        Bank usBank = new USBank(1222, "Sweeden", Currency.EUR, 100, 1400, 4, 444343434);
        User user = new User(1001, "Denis", 12200, 40, "GMD", 1500, usBank);

        UkrainianBankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user, 150);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("!!!");
        }

        bankSystem.withdraw(user, 10);

        System.out.println(bankSystem.getTransactions());

        for (Transaction transaction : bankSystem.getTransactions()) {
            System.out.println(transaction.toString());
        }
    }
}
