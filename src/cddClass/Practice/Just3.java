package cddClass.Practice;

public class Just3 {
    public static void main(String[] args) {
            Just2 account1 = new Just2();
            Just2 account2 = new Just2();

            account1.balance = 5000;
            account1.accountName = "Joseph";
            account1.accountNumber = "0133862242";

            account2.balance = 2500;
            account2.accountName = "Philip";
            account2.accountNumber = "0169742105";


            account1.transfer(account2, 1000);
            System.out.println(account2.balance);
        }
}
