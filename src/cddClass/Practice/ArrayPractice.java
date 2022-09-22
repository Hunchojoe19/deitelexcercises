package cddClass.Practice;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to sum up?: ");
        double number = input.nextDouble();
        double [] myArray = new double[(int) number];
        for (int i = 0; i < myArray.length; i++){

            System.out.println("Enter the numbers " + i +" you want to sum  up: ");
            double num = input.nextDouble();
           System.out.println("The numbers "+ i + " has a typed value of "+ num);
           sum+= num;
           System.out.println("The sum of the numbers = "+ sum);

        }
       double average = sum / myArray.length;
        System.out.println("The average of "+sum + " / "+ myArray.length + " = "+average);
    }
}
