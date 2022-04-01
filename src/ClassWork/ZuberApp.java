package ClassWork;

import java.util.Random;

public class ZuberApp {
    public static void main (String... args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        Random big = new Random ();
        String totalCharacters = letters+small+numbers;
        int lengthOfPasswords = 12;
        char[] passwords = new char[12];
        for (int a = 0; a < lengthOfPasswords; a++) {
            passwords[a] = (totalCharacters).charAt(big.nextInt(totalCharacters.length()));
        }
        System.out.print("Your password is: " + new String(passwords));
    }
}
