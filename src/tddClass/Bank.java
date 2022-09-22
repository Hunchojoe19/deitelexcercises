//package tddClass;
//
//public class Bank {
//    private final String name;
//    private Account [] accounts;// the array for holding account is declared
//    private int numberOfCustomers;
//    public Bank(String bankName, int numberOfCustomers) {
//        name = bankName;
//        accounts = new Account[numberOfCustomers];// the length of the account is initialized for number of customers
//
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getMaximumNumberOfCustomers(){
//        return accounts.length;
//    }
//    public void createAccountFor(String firstName, String lastName, String pin){
//        String accountNumber = (numberOfCustomers+1)+"";
//        Account account = new Account(accountNumber,firstName, lastName, pin);
//        accounts[numberOfCustomers] = account;
//        numberOfCustomers++;
//
//
//    }
//    public int getNumberOfCustomers(){
//        return 0;
//
//    }
//    public Account findAccount(int accountNumber){
//        return accounts[accountNumber - 1];// this is the index of the account array, since the index of the array is 0 for the first customer
//
//        //int indexOfAccount = accountNumber - 1
//        // Account theAccount = accounts[indexOfAccounts]
//        //return theAccount
//
//    }
//
//}
