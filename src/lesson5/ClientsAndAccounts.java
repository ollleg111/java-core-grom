package lesson5;

public class ClientsAndAccounts {
    public static void main(String[] args) {

        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        int devDeposit = 500;
        String clientName = "Nikolay";

        System.out.println(withdraw(names, balances, clientName, devDeposit));

    }

    static int withdraw(String[] clients, int[] balances, String client, int amount) {

        int counter = 0;
        for (int i = 0; i < clients.length; i++) {
            if (client == clients[i])
                counter = i;
        }

        int targetBalance = 0;
        for (int i = 0; i < balances.length; i++) {
            if (counter == i)
                targetBalance = balances[i];
        }

        return calculateDepositAmountAfterDiv(targetBalance, amount);
//        if (targetBalance < amount)
//            return -1;
//        else return targetBalance - amount;

    }

    static int calculateDepositAmountAfterDiv(int moneyClient, int div) {

        return moneyClient < div ? (int) -1 : (int) (moneyClient - div);

    }

//    static int findObject(String cl[], String target) {
//
//        int counter = 0;
//        for (int i = 0; i < cl.length; i++) {
//            if (target == cl[i]) {
//                Sys.out.println(cl);
//                Sys.out.println(i);
//            }
//            i=counter;
//        }
//        return counter;
//    }
}
