package tddClass;

import java.util.Arrays;

public class ArrayAssignment {
    public static void main (String... args){
        int [] array = {12, 15, 25, 18, 10, 18, 20, 24, 6, 4};

        System.out.println(Arrays.toString(array));


        int maxNumber = array[0];// the variable maxNumber is initialized to the first value of the array
        for(int m = 0; m < array.length; m++){
            if (array[m] > maxNumber ) maxNumber = array[m];
        }
            System.out.println("The maximum number from the array is: "+maxNumber);
        
        

        int sum = array[0] + array[1] + array[2] + array[3] + array[4] + array[5]+ array[6]+ array[7]+ array[8]+ array[9];
        System.out.println("The sum of the array is: "+sum);

        int average = sum /array.length;
        System.out.println("The average numbers of array is: "+average);
    }
}
