package cddClass;

import java.util.Scanner;

public class CalculatingSumOfDigits {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        sumOfDigits();

    }
    public static int sumOfDigits(){
        int result = 0;
        for (int count = 0; count < 20; count++) {
            printPrompt("enter four digit number");
            int input = scanner.nextInt();

            if (input > 1000 && input < 10000) {
                int number1 = (input % 10000 / 1000);
                int number2 = (input % 1000 / 100);
                int number3 = (input % 100 / 10);
                int number4 = (input % 10);

                result = number1 + number2 + number3 + number4;
                System.out.println("The sum of digits of " + input + " is " + result);
            } else {
                printPrompt("please enter a four digit number");
                break;

            }
        }
            return 0;
    }
    public static void printPrompt(String message){
        System.out.println(message);
    }
}
