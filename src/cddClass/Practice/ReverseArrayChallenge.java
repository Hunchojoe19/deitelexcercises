package cddClass.Practice;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int [] myArrays = {2,4,6,7,10, 14};
        System.out.println("Arrays are "+  (Arrays.toString(myArrays)));

        reverse(myArrays);
        System.out.println("My reversed arrays are "+(Arrays.toString(myArrays)));
        }
    public static void reverse(int [] arrays){
        int lastIndexedArrays = arrays.length - 1;
        int halfWayLength = arrays.length/2;
        for (int i = 0; i < halfWayLength; i++) {
            int temp = arrays[i];
            arrays[i] = arrays[lastIndexedArrays - i];
            arrays[lastIndexedArrays - i] = temp;
        }
    }
}
