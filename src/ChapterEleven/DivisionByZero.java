package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int numerator = input("Enter numerator ");
        int denominator = input ("Enter denominator ");
        try{
        int approximateQuotient = numerator / denominator;
        display(approximateQuotient+"");}
        catch (ArithmeticException exception){
            display("You cannot be putting zero");
        }
    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }

    private static int input(String prompt){
        display(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        try{
        return keyboardInput.nextInt();
        }
        catch(InputMismatchException ex){
            display("I expect only integers");
            System.exit(3);
        }
        return 0;
    }
}
