package cddClass.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = input.nextInt();
        int [] myArrays = readIntegers(count);

        for (int i = 0; i < myArrays.length; i++){
            System.out.println("Element "+ i + " has a typed value of "+ myArrays[i]);
        }
        int sortedArrays = findMin(myArrays);
        System.out.println("Maximum number = "+sortedArrays);

    }
    public static int [] readIntegers(int count){
    int [] arrays = new int[count];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter number: ");
            int number = input.nextInt();
            input.nextLine();
            arrays [i] = number;
        }
        return arrays;
    }
    public static int findMin(int [] arrays){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            int value = arrays[i];
            if (value < min) {
                min = value;
            }

        }
        return min;
    }
}

