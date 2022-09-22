package cddClass.Practice;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any name: ");
        String name = scanner.nextLine();
        System.out.println(reversedString(name));
    }
    public static String reversedString(String b){

        String[]arrays = new String[b.length()];
        int letterIndex = 0;

        for (int i = b.length()-1; i >= 0; i--) {
            arrays[letterIndex] = String.valueOf(b.charAt(i));
            letterIndex++;
        }
        String letter = "";

        for (int i = 0; i < b.length(); i++) {
            letter += arrays[i];
        }
        return letter;
    }
}
