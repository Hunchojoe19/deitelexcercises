package cddClass;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String... args) {

        Scanner grade = new Scanner(System.in);

        System.out.println("How many students are in the class: ");
        int numberOfStudent = grade.nextInt();

        System.out.println("How many subjects are being offered by the students: ");
        int numberOfSubject = grade.nextInt();

        int[][] array = new int[numberOfStudent][numberOfSubject];// declare the arrays to be used
        //prompt teacher to enter the number of subjects and subjects


        //start inputting the grades of the students according to their subjects
        for (int i = 0; i < array.length; i++) {
            System.out.println("Student "+ (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Subject " +(j+1)+ ": ");
                int scores = grade.nextInt();
                array[i][j] = scores;

            }
            printOutDesign();
        }
        System.out.print("STUDENT \t\t");
        for(int i = 0; i <  numberOfSubject; i++){
            System.out.print("SUB"+(i+1)+"\t");

        }
        System.out.print("TOT\t  ");
        System.out.print("AVE\t\t  ");
        System.out.print("POS\t  ");
        System.out.println("");
            printOutDesign();
                int total = 0;
                double average = 0;
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("\n"+"Student " + (i + 1) + "\t\t ");
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print(array[i][j] + "\t\t");
                total += array[i][j];
                average = (double)total / array.length;
            }
            System.out.print(total + " \t  "+" ");
            total = 0;
            System.out.print(String.format("%.2f",average));
            average = 0;
        }
        System.out.println("");
        printOutDesign();
        }
        public static void printOutDesign(){
            System.out.println("======================================================================================");
        }
    }

