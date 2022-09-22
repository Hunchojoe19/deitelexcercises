package cddClass;

import java.util.Scanner;

public class MinimumAndMaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximum = 0;
        int minimum = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number: ");
            boolean isInt = input.hasNextInt();
            if (isInt) {
                int number = input.nextInt();
                if (first){
                    first = false;
                    maximum = number;
                    minimum = number;
                }
                if (number > maximum){
                    maximum = number;
                }
                if (number < minimum)
                {
                    minimum = number;

                }

            } else {
                System.out.println("Invalid number.");
                break;
            }
            input.nextLine();

        }
        System.out.println("The maximum number = "+ maximum +"," + "The minimum number = " + minimum);
        input.close();
    }
}