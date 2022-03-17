import org.junit.jupiter.api.Test;

public class ReverseTest {
    @Test
    public static void main(String[] args) {
        String stringExample = "Good food";
        System.out.println("Original String: " + stringExample);
        int b = stringExample.length();
        char character;
        String reversedString = " ";

        int i;
        for (i = 0; i < b; i++) {
            character = stringExample.charAt(i);
            reversedString = character +reversedString;
            System.out.println("Reversed String: " + reversedString);
        }
    }
}