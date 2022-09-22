package cddClass.Practice;

import java.util.Scanner;

public class LeapYear {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        isLeapYear();
    }
    public static boolean isLeapYear(){
        prompt("Enter the year of your choice!!!");
       int input = scanner.nextInt();
        if (input % 400 == 0) {
            System.out.println(input +" is a leap year");
        return true;
        }
        else if (input % 4 == 0){
            System.out.println(input +" is a leap year");
            return true;
        }
        else{
            System.out.println(input +" is not a leap year");
        return false;}

    }
    public static void prompt(String message){
        System.out.println(message);
    }
}
