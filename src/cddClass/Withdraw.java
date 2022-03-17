package cddClass;

public class Withdraw {
   private int balance;
    public void deposit(int amount) {
    balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int cash) {
        if (cash < balance && cash > 0) ;
        {
            balance = balance - cash;
        }
        if (cash > balance) {
            cash = 0;
        }
    }
}
