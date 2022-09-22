package cddClass.Practice;

import java.util.Scanner;

public class ParkingCharges {
    public static int dayCharges = 10;
    public static double additionalCharges = 0.5;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        calculateCharges("John", 5);
    }
    public static void calculateCharges(String name, int hours){
        double totalCharges = 0;
        System.out.println("Please what is your name? ");
        name = scanner.nextLine();
        System.out.println("How long would you want to park your car in hours?");
        hours = scanner.nextInt();
        double charges = 2.0;
        boolean flag = true;
        while(flag && hours >= 0){
            flag = false;
            if(hours == 3){
                System.out.println("Dear "+ name +", The total charge for " +hours+ " hours"+" is $"+charges);
            }
                if (hours > 3 && hours < 24){
                    totalCharges+=charges;
                    charges = (hours-3)/2.0;
                    charges+=additionalCharges;
                    totalCharges+=charges;
                    System.out.println("Dear "+ name +", The total charge for " +hours+ " hours"+" is $"+totalCharges);
                     }

            else if (hours == 24){
                    charges = dayCharges;
                System.out.println("Dear "+ name +", The total charge for " +hours+ " hours"+" is $"+charges);
            }
            else if (hours < 3){
                System.out.println("You have 0 charge");}
            else
                System.out.println("You cannot park for more than 24 hours");
        }

    }

}
