package cddClass;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String... args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        for (int num = 1; num <= 12; num++){
            System.out.println(num1+ " x "+num+ " = "+(num1 * num));
        }
    }
}
