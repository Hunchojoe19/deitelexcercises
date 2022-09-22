//package tddClass;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AccountTest {
//
//    @Test
//    public void depositTest() {
//
//        Account josephAccount = new Account();
//
//        josephAccount.deposit(100);
//        assertEquals(100, josephAccount.getBalance());
//
//    }
//
//    @Test
//    public void depositTwiceTest() {
//
//        Account josephAccount = new Account ();
//
//        josephAccount.deposit(900);
//        josephAccount.deposit(500);
//        assertEquals(1400, josephAccount.getBalance());
//    }
//    @Test
//    @DisplayName("Test that Negative deposit will not work")
//    public void depositNegativeDeposit() {
//        Account josephAccount = new Account();
//        josephAccount.deposit (1000);
//        josephAccount.deposit (-500);
//        assertEquals(1000, josephAccount.getBalance());
//    }
//    @Test
//    @DisplayName("Test that the withdrawal will work")
//    public void withdrawAmount(){
//        Account josephAccount = new Account();
//        josephAccount.deposit(1000);
//        josephAccount.withdraw(500);
//        assertEquals(500, josephAccount.getBalance());
//    }
//    @Test
//    @DisplayName("Balance less than withdrawal request")
//    public void WithdrawLessAmount(){
//        Account josephAccount = new Account();
//        josephAccount.deposit(2000);
//        josephAccount.withdraw(5000);
//        assertEquals(2000, josephAccount.getBalance());
//    }
//
//    @Test
//    @DisplayName("Test of withdrawal without money")
//    public void Withdrawal(){
//        Account josephAccount = new Account();
//        josephAccount.withdraw(1000);
//        assertEquals(0, josephAccount.getBalance());
//    }
//}
