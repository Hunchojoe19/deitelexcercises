import Kata.Kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {
    //@Test
    //public void numberIsPalindrome(){
    //  Kata kata = new Kata();
    //boolean result = kata.enterNumber(13231);
    //assertEquals(true, result);
    @Test
    void theTotalPriceForCopiesRangingFrom1To4() {
        Kata kata = new Kata();
        int result = kata.enterNumberOfCopies(2);
        assertEquals(4000, result);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom5To9() {
        Kata kata = new Kata();
        int result = kata.enterNumberOfCopies(6);
        assertEquals(10800, result);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom10To29() {
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(22);
        assertEquals(35200, totalPrice);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom30To49() {
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(43);
        assertEquals(64500, totalPrice);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom50To99() {
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(80);
        assertEquals(104000, totalPrice);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom100To199() {
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(130);
        assertEquals(156000, totalPrice);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom200To499() {
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(320);
        assertEquals(352000, totalPrice);
    }

    @Test
    void theTotalPriceForCopiesRangingFrom500AndAbove() {
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(500);
        assertEquals(500000, totalPrice);
    }

    @Test
    void theQuotientOfTwoNumbersTest() {
        Kata kata = new Kata();
        int quotient = kata.enterTwoNumbers(10, 2);
        assertEquals(5, quotient);
    }

    @Test
    void theWhileTest() {
        int number = 2;
        while (number <= 100) {
            System.out.print(number + " ");
            number = number + 2;
        }
    }
    //@Test
    //void theModuloTest(){
    //  int number =1;
    //while(number <= 10){
    //  if (number%2==0){
    //    System.out.print(number+ " ");

    @Test
    void evenNumber() {
        Kata kata = new Kata ();
        boolean result = kata.isEven(100000000);
        assertTrue(result);
    }
    @Test
    void biggestNumber(){
        Kata kata = new Kata ();
        int result = kata.bigNumbers(2,30,5,6,7);
        assertEquals(30, result);
    }
    @Test
    void factorNumbers(){
        Kata kata = new Kata();
        int result = kata.factorNumbers(24);
        assertEquals(8, result);
    }
    @Test
    void primeNumbers(){
        Kata kata = new Kata();
        boolean result = kata.isPrime(11);
        assertTrue(result);
    }
}

