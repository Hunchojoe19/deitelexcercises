package tddClass;

//import jdk.internal.logger.DefaultLoggerFinder;//

public class AccountClass {
    public int balance;
    public void setDeposit(int amount) {
        balance = balance + amount;
    }

    public int getName() {
        return balance;
    }

    public void setWithdrawl(int cash) {
        if (balance < cash) {cash = 0;} {System.out.print("withdrawal amount exceeded balance");}
        balance = balance - cash;
    }

    public int getWithdrawal() {
        return balance;
    }
}
