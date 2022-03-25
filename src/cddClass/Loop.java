package cddClass;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loop {
    public static void main(String... args){
        int count = 0;
        //SecureRandom joe = new SecureRandom();
        Scanner input = new Scanner(System.in);
        for(;;){
            if (count > 100)
                break;
            if (count < 0)
                break;
                count = input.nextInt();
                System.out.println("Huncho");
                System.out.println("count is " + count);
            }
    }
}
