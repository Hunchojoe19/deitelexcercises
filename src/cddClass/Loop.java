package cddClass;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loop {
    public static void main(String... args){
        int count = 1;
        SecureRandom joe = new SecureRandom();
        Scanner input = new Scanner(System.in);
        for(;count < 10;count++){
//            if (count < 0)
//                break;
//            if (count < 0)
//                break;
                count = 1+joe.nextInt(10);
                System.out.println("Huncho");
                System.out.println("count is "+count);
            }
    }
}
