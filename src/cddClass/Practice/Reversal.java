package cddClass.Practice;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name? ");
        String name = scanner.nextLine();

        StringBuilder buffer = new StringBuilder(name);
        System.out.println(buffer.reverse().toString());

    }
}
