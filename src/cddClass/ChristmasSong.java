package cddClass;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int days;

        for (days = 1; days <= 12; days++) {
            switch (days) {
                case 1:
                    System.out.println("first day of christmas my true love sent to me");
                    System.out.println("a partridge in a pear tree");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("second day of christmas my true love sent to me");
                    System.out.println("two turtle doves");
                    System.out.println("and a partridge in a pear tree");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("third day of christmas my true love sent to me");
                    System.out.println("three french hens");
                    System.out.println("two turtle doves");
                    System.out.println("a partridge in a pear tree");
                    System.out.println();

                    break;
                case 4:
                    System.out.println("fourth day of christmas my true love sent to me");
                    break;
                case 5:
                    System.out.println("fifth day of christmas my true love sent to me");
                    break;
                case 6:
                    System.out.println("sixth day of christmas my true love sent to me");
                    break;
                case 7:
                    System.out.println("seventh day of christmas my true love sent to me");
                    break;
                case 8:
                    System.out.println("eight day of christmas my true love sent to me");
                    break;
                case 9:
                    System.out.println("ninth day of christmas my true love sent to me");
                    break;
                case 10:
                    System.out.println("tenth day of christmas my true love sent to me");
                    break;
                case 11:
                    System.out.println("eleventh day of christmas my true love sent to me");
                    break;
                case 12:
                    System.out.println("twelfth day of christmas my true love sent to me");
                    break;
                default:
                    System.out.println("There are no other days left after 12");
            }
        }
    }
}
