package cddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithdrawTest {
    @Test
    public void depositTest() {
        Withdraw josephJohn = new Withdraw();
        josephJohn.deposit (1000);
        assertEquals(1000, josephJohn.getBalance());
    }

    @Test
    public void depositTwiceTest (){
        Withdraw josephJohn = new Withdraw();
        josephJohn.deposit (2500);
        josephJohn.deposit (3600);
        josephJohn.deposit (5000);
        assertEquals(11100, josephJohn.getBalance());
    }

    @Test
    public void withdraw(){
        Withdraw josephJohn = new Withdraw();
        josephJohn.deposit (3500);
        josephJohn.withdraw (2600);
        assertEquals(900, josephJohn.getBalance());
    }

    @Test
    @DisplayName ("Test that cash withdrawn cannot exceed the balance")
    public void withdrawExcessively() {
        Withdraw josephJohn = new Withdraw();
        josephJohn.deposit (7000);
        josephJohn.withdraw(3500);
        josephJohn.withdraw (4000);
        assertEquals(3500, josephJohn.getBalance());

    }
}
