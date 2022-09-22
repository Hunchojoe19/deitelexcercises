//package tddClass;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class BankTest {
//    private Bank gtBank;
//            @BeforeEach
//    public void setUp(){
//                gtBank = new Bank ("Gtbank", 10);
//            }
//
//    @Test
//    public void bankCanBeCreated(){
//        Bank gtBank = new Bank ("GtBank", 10);
//        assertNotNull(gtBank);
//        assertEquals("Gtbank", gtBank.getName());
//        assertEquals(10, gtBank.getMaximumNumberOfCustomers());
//    }
//    @Test
//    public void bankCanCreateAccountTest(){
//        gtBank.createAccountFor("Saheed", "Osupa", "1234");
//        assertEquals(1, gtBank.getNumberOfCustomers());
//    }
//    @Test
//    public void createAccountCheckForFirstCustomerTest(){
//        gtBank.createAccountFor("saheed", "Osupa", "1234");
//        assertEquals(1, gtBank.getNumberOfCustomers());
//
//        Account account = gtBank.findAccount(1);//To ensure that the account created can be found
//        assertEquals("Saheed Osupa", account.getAccountName());
//        assertEquals("1", account.getAccountNumber());
//
//    }
//}
