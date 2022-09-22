package cddClass.Practice;


public class BarChart {
 public static void main(String[] args) {
         int[] array = {0, 5, 2, 6, 0, 0, 1, 15, 12, 12, 1};

         System.out.println("Grade distribution:");
         for (int count = 0; count < array.length; count++){
             if (count == 10) {
                 System.out.printf("%7d:  ", 100);
                }
             else{
                 System.out.printf("%02d - %02d: " , count * 10, (count * 10) + 9 );
             }
             for (int shapes = 0; shapes < array[count]; shapes++) {
                 System.out.printf("* ");
         }
             System.out.println();


             }

         }

     }

