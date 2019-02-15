package lesson20.task2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(404, "Odessa", 20, "payment",
                TransactionType.INCOME, new Date());
        Transaction transaction2 = new Transaction(505, "Kiev", 20, "payment",
                TransactionType.OUTCOME, new Date());
        Transaction transaction3 = new Transaction(111, null, 20, "payment",
                TransactionType.OUTCOME, new Date());
        Transaction transaction4 = new Transaction(222, "Kiev",100, null,
                TransactionType.OUTCOME, new Date());
        Transaction transaction5 = new Transaction(333, "Kiev",10, "payment",
                TransactionType.OUTCOME, new Date());
        Transaction transaction6 = new Transaction(505, "Kiev", 20, "payment",
                TransactionType.OUTCOME, new Date());
        Transaction transaction7 = new Transaction(606, "Lvov", 20, "payment",
                TransactionType.OUTCOME, new Date());
        Transaction transaction8 = null;

       Controller controller = new Controller();

        try {
            System.out.println(controller.save(transaction1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction6));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(controller.save(transaction8));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------");

        try {
            System.out.println(Arrays.toString(controller.transactionList()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(controller.transactionList(20)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(controller.transactionList(30)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(controller.transactionList(0)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(controller.transactionList("Odessa")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
