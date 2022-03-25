package cddClass;

import java.sql.SQLOutput;

public class TrianglePrinting {
    public static void main(String... args) {
        for (int r = 1; r <= 10; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int r = 10; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int r = 1; r <= 10; r++){
            for (int c = 1; c <= 10 -r; c++){
                System.out.print("  ");
            }
            for (int k = 1; k <= r; k++) {
                    System.out.print("* ");
                }
                    System.out.println();
                }
        System.out.println();
        for (int r = 10; r >= 1; r--){
                for (int c = 1; c <= 10 - r; c++){
                    System.out.print("  ");
                }
                for (int p = 1; p <= r; p++){
                    System.out.print("* ");
                }
            System.out.println();
        }
            }

}

