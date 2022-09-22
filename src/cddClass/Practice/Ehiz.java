package cddClass.Practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ehiz {
    public static void main(String[] args) {
//        System.out.println("Sum of all odd numbers tripled between 1 to 20 = " +
//                IntStream.rangeClosed(1, 20)
//                        .filter(x -> x % 2 != 0)
//                        .mapToDouble(x -> Math.pow(x, 3))
//                        .sum());
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a word you want to be reversed?. ");
//        String input = scanner.nextLine();
//        for (int count = input.length() - 1; count >= 0; count--) {
//            System.out.printf("%c ", input.charAt(count));
//            }
//        String s = "Joseph";
//        String letters = "abcdefghijklmabcdefghijklm";
//        System.out.println(s.indexOf('$'));
//        System.out.println(s.lastIndexOf('p'));
//        System.out.println(letters.indexOf("def", 7));
//
//        for (int i = s.length() - 1; i>= 0; i--) {
//            System.out.printf("%c ", s.charAt(i));
//        }

        StringBuilder buffer = new StringBuilder("God is Good");
        char [] charArray = new char[buffer.length()];
        System.out.println("buffer is "+buffer.toString());
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.println("The characters are : ");

        for (char characters : charArray){
            System.out.print(characters);
        }
        System.out.println("The reversed character is "+buffer.reverse());
        StringBuilder buffers = new StringBuilder("Joe");
        String string = "Hello ";
        String s = new StringBuilder("Hello ").append(buffers ).append(" its tuesday").toString();
//        buffer.append(string).append(System.getProperty("line.separator"));
        System.out.println("The buffer contains "+ s);
    }

}
