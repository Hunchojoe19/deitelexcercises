package cddClass;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner whiz = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Students name: ");
            String name = whiz.nextLine();
            System.out.print("Enter Students grades: ");
            String grades = whiz.nextLine();

            switch (grades) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
            }
        }
        System.out.println("number of grade A is " + countA);
        System.out.println("number of grade B is " + countB);
        System.out.println("number of grade C is " + countC);
        System.out.println("number of grade D is " + countD);
    }
}
