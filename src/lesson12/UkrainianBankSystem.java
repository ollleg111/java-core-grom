package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        if (!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }
//        int limitOfWithdrawl = user.getBank().getLimitOfWithdrawal();

//        if (amount + user.getBank().getCommission(amount) > limitOfWithdrawl) {
//            printWithdrawalErrorMsg(amount, user);
//            return;
//        }
//        if (amount + user.getBank().getCommission(amount) > user.getBalance()) {
//            printWithdrawalErrorMsg(amount, user);
//            return;
//        }
//        if (!checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()))
//            return;
//        if (!checkWithdrawLimits(user, amount, user.getBalance()))
//            return;
//        double balanceAfterWithdraw = user.getBalance() - amount - user.getBank().getCommission(amount);
//        user.setBalance(balanceAfterWithdraw);


//    private boolean checkWithdraw(User user, int amount, double limit) {
//        if (!checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
//        return false;
//        if (!checkWithdrawLimits(user, amount, user.getBalance()))
//            return false;
//        return true;


    @Override
    public void fund(User user, int amount) {
        if (!checkFundingLimits(user, amount))
            return;
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

//        if (!checkWithdraw(fromUser, amount))
//            return;
//        fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
//
//        if (!checkWithdraw(toUser, amount))
//            return;
//        fund(toUser, amount);

        if (fromUser.getBank().getCurrency() != toUser.getBank().getCurrency())
            return;
        if (!checkWithdraw(fromUser, amount) || !checkFundingLimits(toUser, amount))
            return;
        fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        if (!checkFundingLimits(user, user.getSalary()))
            return;
        user.setBalance(user.getBalance() + user.getSalary());
    }

    private boolean checkFundingLimits(User user, int amount) {
        if (amount - user.getBank().getCommission(amount) > user.getBank().getLimitOfFunding()) {
            printFundingErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private void printFundingErrorMsg(int amount, User user) {
        System.err.println("Can't fund money " + amount + " to user " + user.toString());
    }
}
