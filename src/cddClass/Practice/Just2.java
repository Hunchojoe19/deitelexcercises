package cddClass.Practice;

public class Just2 {
    public String accountNumber;
    public double balance;
    public String accountName;


        private void deposit ( int amount){
            balance += amount;
        }
        public boolean withdraw ( int amount){
            if (balance < amount) {
                System.out.println("You do not have enough funds in your account");
                return false;
            } else
                System.out.println("Withdrawal successful");
            return true;
        }
        public void transfer (Just2 receiversAccount,int amount){
            balance -= amount;
            receiversAccount.balance += amount;
        }
    }