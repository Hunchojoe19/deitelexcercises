package chapterTwo;

import java.util.Scanner;
	public class Addition {
	 public static void main (String... args) {
	 Scanner blur = new Scanner (System.in);
	 System.out.print("Enter first number:");
	 int number1 = blur.nextInt ();
	 System.out.print("Enter second number:");
	 int number2 = blur.nextInt ();
	 int sum = number1 + number2;
	 System.out.printf("sum of %d and %d is %d%n " , number1 , number2 , sum);
	}
}