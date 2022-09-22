package cddClass.Practice;

import java.util.Locale;
import java.util.Scanner;

public class BeautifyingStrings {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        beautify();
    }
    public static void beautify(){

        input("Enter the word of your choice");
        String collect = scanner.nextLine();


            if (collect.charAt(collect.length()-1) != '.'){
                collect = collect + '.';
            }
           char firstLetter = collect.toUpperCase().charAt(0);
            System.out.print(firstLetter);

            for (int i = 1; i < collect.length(); i++){
            System.out.print(collect.charAt(i));
        }

    }

    private static void input(String prompt) {
        System.out.println(prompt);
    }
}
