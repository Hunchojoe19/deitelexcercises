package ChapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
                System.out.println("Enter customer name: ");
                String customer = input.nextLine();
                System.out.println("Enter hours parked by the customer: ");
                int hours = input.nextInt();

        }

    }

    private static int calculateCharges(int time){
        int fine = 0;
        if (time == 3){
        int charges = 2;
        fine += charges;
        }
        return fine;
    }
    private static double additionalCharges(int extraHours){
        double totalAdditionalCharges = 0.5 * extraHours;
        return totalAdditionalCharges;
    }
}
