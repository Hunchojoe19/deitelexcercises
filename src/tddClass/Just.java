package tddClass;

import java.util.Random;
import java.util.Scanner;

public class Just {
    public static void main(String[] args) {
//        int action = 0;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter options Y or N ");
//        String letter = scanner.nextLine();
//
//        if (letter.equalsIgnoreCase("Y")){
//            System.out.println("Yes");
//        }else if (letter.equalsIgnoreCase("N")){
//            System.out.println("No");
//        }else{
//            System.out.println("Invalid input");
//        }

//        while (action <= 10) {
//            System.out.print("Enter any number of your choice:");
//            int number = scanner.nextInt();
//
//            if (number % 2 == 0) {
//                System.out.println("number " + number + " is even. ");
//            } else {
//                System.out.println("number " + number + " is odd");
//            }
//            action++;
//        }
//        int month = 6;
//        String monthString;
//        switch (month){
//            case 1: monthString = "JANUARY";
//            break;
//            case 2: monthString = "FEBRUARY";
//            break;
//            case 3: monthString = "MARCH";
//            break;
//            case 4: monthString = "APRIL";
//            break;
//            case 5: monthString = "MAY";
//            break;
//            case 6: monthString = "JUNE";
//            break;
//            case 7: monthString = "JULY";
//            break;
//            case 8: monthString = "AUGUST";
//            break;
//            case 9: monthString = "SEPTEMBER";
//            break;
//            default: monthString = "Invalid month";
//        }
//        System.out.println(monthString);
        int number;
        Random randomNumber = new Random();
        int number2 = randomNumber.nextInt(10);
        while(true){
            System.out.println("Enter the secret number: ");
            number = scanner.nextInt();

            if (number ==number2){
                System.out.println("Congratulations, You won!");
                break;
            }
            else if (number < number2){
                System.out.println("Almost there, the secret number is greater than that ");
            }
            else if (number > number2){
                System.out.println("Almost there, the secret number is less than that");
            }
        }
        System.out.println("The number "+number+ " is same with random number "+number2);

    }
}