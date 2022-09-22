package tddClass;

import java.util.Scanner;

public class HeartRates {
    static String name;
    static String lastnameOfObject;
    static String monthOfBirth;
    static String dayOfBirth;
    static int yearOfBirth;
    static int currentYear;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        name = input.nextLine();

        System.out.println("Enter your last name: ");
        lastnameOfObject = input.nextLine();

        System.out.println("Enter your month of birth: ");
        monthOfBirth = input.nextLine();

        System.out.println("Enter day of birth: ");
        dayOfBirth = input.nextLine();

        System.out.println("Enter year of birth");
        yearOfBirth = input.nextInt();

        System.out.println("Enter the current year: ");
        currentYear = input.nextInt();

        System.out.print(getName()+ " ");
        System.out.println(getLastnameOfObject());
        System.out.println(getMonthOfBirth()+ " / " + getDayOfBirth()+ " / "+ getYearOfBirth());
        System.out.println("Your are currently "+ age()+ " years old");
        System.out.println("Your maximum heart rate in beats per minute is "+ maximumHeartRate());
        System.out.println("Your target heart rate is "+ Math.ceil(getTargetHeartRate())+"%"+"\n".repeat(1));
        System.out.println("Consult your Doctor if your heart rate is lower than 50% or higher than 85%");

    }
    public static String getName(){
        return name;
    }
    public static String getLastnameOfObject(){
        return lastnameOfObject;
    }

    public static String getMonthOfBirth() {
        return monthOfBirth;
    }

    public static String getDayOfBirth() {
        return dayOfBirth;
    }

    public static int getYearOfBirth() {
        return yearOfBirth;
    }
    public static int age(){
        return currentYear - yearOfBirth;
    }
    public static int maximumHeartRate(){
        return 220 - age();}

    public static double getTargetHeartRate() {
        return (0.85 * (maximumHeartRate())) - (0.50 * (maximumHeartRate()));
    }
}