package cddClass.Practice;

import java.util.Scanner;

public class DescendingOrderArray {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myArrays = getIntegers(5);
        printOutArray(myArrays);
        System.out.println();
      int[] sorted = sortIntegers(myArrays);
      printOutArray(sorted);

    }
    public static int[] getIntegers (int number){
        System.out.println("Enter "+ number + " numbers you want to sort in descending order.\r");
        int [] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = input.nextInt();
        }
        return values;
    }
    public static void printOutArray(int [] arrays){
        for (int i = 0; i < arrays.length; i++){
            System.out.println("The element "+ i + ", typed value was "+ arrays[i]);
        }
    }
    public static int [] sortIntegers(int [] arrays){
        int [] sortedArray = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            sortedArray[i] = arrays[i];
        }
            boolean flag = true;
            int temp;
            while(flag){
                flag = false;
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    if (sortedArray[i] < sortedArray[i + 1]){
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i + 1];
                        sortedArray [i + 1] = temp;
                        flag = true;
                    }
            }
        }
            return sortedArray;
    }
}
