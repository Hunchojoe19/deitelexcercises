package cddClass;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String... args){

        Scanner numbers = new Scanner(System.in);
        int count = 1;
        int result = 0;
        int correctNumbers = 0;
        int wrongAnswers = 0;

        for (; count <=10; count++ ) {
            int answer;
            String operatorSwitch;
            SecureRandom input = new SecureRandom();
            int firstRandomNumber = 1+input.nextInt(100);
            int secondRandomNumber = 1+input.nextInt(100);


            SecureRandom operatorRandom = new SecureRandom();
            int operator = 1+operatorRandom.nextInt(4);
            switch (operator) {
                case 1: {operatorSwitch = " + ";
                    result = firstRandomNumber + secondRandomNumber;
                    break;}
                case 2:{operatorSwitch =" - ";
                result = firstRandomNumber - secondRandomNumber;
                break;}
                case 3:
                    {operatorSwitch = " / ";
                result = firstRandomNumber / secondRandomNumber;
                break;}
                case 4:
                    {operatorSwitch = " * ";

                result = firstRandomNumber * secondRandomNumber;
                break;}
                default: operatorSwitch = " ";
            }
            System.out.println("What is "+firstRandomNumber + operatorSwitch + secondRandomNumber+ "?");
            answer = numbers.nextInt();

            if (answer == result) {
                System.out.println("Correct answer!"+ "the answer is " +result);
            correctNumbers++;}
                else {
                    System.out.println("Wrong answer!, Correct answer is " +result);
                    wrongAnswers++;
            }
        }
        System.out.println();
        System.out.println("You got " +correctNumbers + " questions correct");
        System.out.println();
        System.out.println("You failed " +wrongAnswers+ " question(s)");
    }
}

