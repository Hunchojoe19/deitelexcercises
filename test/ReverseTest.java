import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ReverseTest {
    @Test
    public static void main(String[] args) {
        Scanner jay = new Scanner(System.in);// create the scanner class to prompt users input
        System.out.println("Enter any words of your choice: ");
        String stringExample = jay.nextLine();// users input are collected
        System.out.println("Original String: " + stringExample); // the user's word of choice is being printed out
        stringExample.length(); // this is initialized to get the length of the user's input
        char character;
        String reversedString = " ";

        int i;
        for (i = 0; i < stringExample.length(); i++) {
            character = stringExample.charAt(i);
            reversedString = character +reversedString;
            System.out.println("Reversed String: " + reversedString);
        }
    }
}