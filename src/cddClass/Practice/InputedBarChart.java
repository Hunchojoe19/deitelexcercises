package cddClass.Practice;

import java.util.Scanner;

public class InputedBarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("How many grades do you want to input?:");
            int grade = input.nextInt();
            input.nextLine();
            int [] array = new int[grade];
        for (int counter = 0; counter < array.length; counter++) {
            System.out.println("Enter the grade: ");
            int num = input.nextInt();
            array[counter] = num;
        }
        for (int counter = 0; counter < array.length; counter++) {

            if (counter== 10) {
                System.out.printf("%5d ", 100);
            }
            else
            {
                System.out.printf("%02d - %02d ", counter * 10, (counter * 10) + 9);
            }
            for (int shapes = 0; shapes < array[counter]; shapes++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     }
}
