package cddClass.Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
    static int result;
    public static void main(String[] args) {
        int count = 10;
        Scanner scanner = new Scanner(System.in);

        while (count != 0) {
            message("Please enter a number: ");
            int numerator = scanner.nextInt();

            message("Please enter a number: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                message("You have " + count + " trials left");
            }
            else {quotient(numerator, denominator);
                count--;}
        }

    }
    public static int quotient(int numerator, int denominator){

       try {
           result = numerator / denominator;
       }

       catch (ArithmeticException arithmeticException){
           System.out.println("Please enter a denominator greater than zero!!!");

       }
       catch (InputMismatchException inputMismatchException){
           System.out.println("Please enter a valid number!!! ");
       }
//       int result = numerator / denominator;
        System.out.println("The answer is "+result);
        return result;
    }
    public static void message (String prompt){
        System.out.println(prompt);
    }
}
