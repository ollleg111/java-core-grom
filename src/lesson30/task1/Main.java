package lesson30.task1;

public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank(22, "USA", Currency.USD,
                1000, 2000, 9, 100000);
        Bank euBank = new EUBank(33, "Poland", Currency.EUR,
                100, 2000, 62, 500000);
        Bank chinaBank = new ChinaBank(44, "China", Currency.USD,
                100, 500, 12, 100000);


        User user1 = new User(1, "Alex", 10000, 20, "Microsoft", 1200, euBank);
        User user2 = new User(2, "Bob", 12200, 40, "Github", 1400, euBank);
        User user3 = new User(3, "Kat", 3000, 8, "DW", 600, usBank);
        User user4 = new User(4, "Susana", 100000, 10, "PepsiCo", 1200, usBank);
        User user5 = new User(5, "Li", 4500, 2, "RedDragon", 300, chinaBank);
        User user6 = new User(6, "Cho", 2000, 17, "NiHao", 900, chinaBank);

        System.out.println("                   1");

        BankSystem ukrainianBankSystem1 = new UkrainianBankSystem();
        ukrainianBankSystem1.withdraw(user2, 150);
        System.out.println(user2.getBalance());
        System.out.println("");

        ukrainianBankSystem1.paySalary(user2);
        System.out.println(user2.getBalance());

        ukrainianBankSystem1.fund(user2,200);
        System.out.println(user2.getBalance());

        ukrainianBankSystem1.transferMoney(user2, user1, 100);
        System.out.println(user2.getBalance());
        System.out.println(user1.getBalance());

        System.out.println("                   2");

        BankSystem ukrainianBankSystem2 = new UkrainianBankSystem();
        ukrainianBankSystem2.withdraw(user3, 150);
        System.out.println(user3.getBalance());
        System.out.println("");

        ukrainianBankSystem2.paySalary(user2);
        System.out.println(user3.getBalance());

        ukrainianBankSystem2.fund(user2,200);
        System.out.println(user3.getBalance());

        ukrainianBankSystem2.transferMoney(user3, user4, 100);
        System.out.println(user3.getBalance());
        System.out.println(user4.getBalance());

        System.out.println("                   3");

        BankSystem ukrainianBankSystem3 = new UkrainianBankSystem();
        ukrainianBankSystem3.withdraw(user5, 90);
        System.out.println(user5.getBalance());
        System.out.println("");

        ukrainianBankSystem3.paySalary(user5);
        System.out.println(user5.getBalance());

        ukrainianBankSystem3.fund(user5,60);
        System.out.println(user5.getBalance());

        ukrainianBankSystem3.transferMoney(user5, user6, 50);
        System.out.println(user5.getBalance());
        System.out.println(user6.getBalance());

    }
}
