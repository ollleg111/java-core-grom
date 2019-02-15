package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {

    private static Transaction[] transactions = new Transaction[10];
    private static Utils utils = new Utils();

// сумма транзакции больше указаного лимита
// сумма транзакции за день больше дневного лимита
// количество транзакций за день больше указаного лимита

// если город оплаты(совершения транзакции) не разрешен badRequest
// не хватило места internal

// проверить одинаковые транзакции

    public Transaction save(Transaction transaction) throws Exception {

        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction amount bigger then limit " + utils.getLimitSimpleTransactionAmount());

        checkTransactionsPerDayRules(transaction);

        checkTransactionCity(transaction);

        // проверить одинаковые транзакции
        for (Transaction tr : transactions) {
            if (transaction.equals(tr))
                throw new BadRequestException("Transaction: " + transaction.getId() + " is already exist");
        }

        int index = 0;
        for (Transaction tr : transactions) {
            if (tr == null) {
                transactions[index] = transaction;
                return transaction;
            }
            index++;
        }
        throw new InternalServerException("There is no free space to save transaction. Transaction " +
                transaction.getId() + " can't be saved");
    }

    private void checkTransactionsPerDayRules(Transaction transaction) throws Exception {

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum + transaction.getAmount() > utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() +
                    ". Can't be saved");
        }

        if (count + 1 > utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() +
                    ". Can't be saved");
        }
    }

    private void checkTransactionCity(Transaction transaction) throws BadRequestException {

        for (String city : utils.getCities()) {
            if (city.equals(transaction.getCity()))
                return;
        }
        throw new BadRequestException("Transaction to city: " + transaction.getCity() +
                " with id " + transaction.getId() + " is incorrect");
    }

    Transaction[] transactionList() {

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null)
                count++;
        }

        Transaction[] tr = new Transaction[count];

        int index = 0;
        for (Transaction transaction : transactions) {

            if (transaction != null) {
                tr[index] = transaction;
                index++;
            }
        }
        return tr;
    }

    Transaction[] transactionList(String city) {

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && city != null && city.equals(transaction.getCity()))
                count++;
        }

        Transaction[] tr = new Transaction[count];

        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && city != null && city.equals(transaction.getCity())) {
                tr[index] = transaction;
                index++;
            }
        }
        return tr;
    }

    Transaction[] transactionList(int amount) {

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && amount == transaction.getAmount()) {
                count++;
            }
        }

        Transaction[] tr = new Transaction[count];

        int index = 0;
        for (Transaction transaction : transactions) {

            if (transaction != null && amount == transaction.getAmount()) {
                tr[index] = transaction;
                index++;
            }
        }
        return tr;
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCutTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCutTransaction);

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }
}
