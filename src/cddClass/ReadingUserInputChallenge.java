package cddClass;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);


        for (int counter = 1; counter <= 10; ){
            System.out.println("Enter number #"+ counter+":");
            boolean hasNextInt = input.hasNextInt();
            if (hasNextInt){
                int number = input.nextInt();
                counter++;
            sum = sum + number;

            }else {
                System.out.println("Invalid number.");
            }input.nextLine();
        }
        System.out.println("The sum of the numbers are "+ sum);
        input.close();
    }
}
