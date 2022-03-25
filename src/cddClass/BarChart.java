package cddClass;


import java.util.Scanner;

public class BarChart {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        System.out.print("Enter third number: ");
        number3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        number4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        number5 = input.nextInt();
    barChart(number1);
    barChart(number2);
    barChart(number3);
    barChart(number4);
    barChart(number5);}

        private static void barChart(int number) {
            for (int i = 1; i <= number; i++){
                if (number <= 30) System.out.print("* ");
            }
            System.out.println();
        }
    }