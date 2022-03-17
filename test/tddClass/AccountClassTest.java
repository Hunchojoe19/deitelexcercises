package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountClassTest {
    @Test
    public void depositTest() {
        AccountClass acc = new AccountClass();
        acc.setDeposit(500);
        assertEquals(500, acc.getName());
    }

    @Test
    void checkWithdrawal() {
        AccountClass acc = new AccountClass();
        acc.setDeposit(2500);
        acc.setWithdrawl(1000);
        assertEquals(1500, acc.getWithdrawal());
    }

    @Test
    void checkWithdrawalAboveBalance() {
        AccountClass acc = new AccountClass();
        acc.setDeposit(2500);
        acc.setWithdrawl(4500);
        assertEquals(2500, acc.getWithdrawal());
    }
}