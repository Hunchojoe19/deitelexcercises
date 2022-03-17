import Kata.Kata;
import org.junit.jupiter.api.Test;



public class NumberTest {

    @Test
    void numberCanBePrinted() {

        int number = 1;
        while (number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (number % 3 == 0) {
                System.out.println("Fizz ");
            } else if (number % 5 == 0) {
                System.out.println("Buzz ");

            } else System.out.println(number + " ");
            number = number + 1;
        }
    }
}