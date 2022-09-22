package cddClass.Practice;

import java.util.Scanner;

public class CalculateInDays {

    public static void main(String[] args) {

        Days();
    }
    public static void Days(){
        long time = 30;
        long year = 360;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of day(s): ");
        long days = scanner.nextLong();
        long result =  ((days - year)/time);

        if (days >= 30 && days <360){
            System.out.println(days /time + " month(s) "+ (days - time)+ " day(s)");
        }
       else if (days >= 360){
            if ((days - year) >= 30){
                 result =  ((days - year)/time);
                System.out.println(days /year + " year(s) "+ result + " month(s)");
            }
            else{
                System.out.println(days /year + " year(s) "+ (days - year)+ " day(s)");
            }
        }
       else if (days <= 0){
            System.out.println("invalid amount of days ");
        }
        else{
            System.out.println(days + " day(s)");
        }
    }
}
