package cddClass.Practice;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI {

    static final Scanner scanner = new Scanner(System.in);
    static final SecureRandom secureRandom = new SecureRandom();
    static  final Random random = new Random();
    public static void main(String[] args) {
    while (true) {
        question();
        question2();
    }

    }
    public static void question(){

            int number1 = 1 + secureRandom.nextInt(9);
            int number2 = 1 + secureRandom.nextInt(9);
            prompt("What is " + number1 + " times " + number2 + "?");
            int answer = scanner.nextInt();
            int result = number1 * number2;
            while (true) {
                if (answer != result) {
//                    System.out.println("No, please try again");
                    randomMethod2();
                    prompt("What is " + number1 + " times " + number2 + "?");
                    answer = scanner.nextInt();
                } else {
//                    System.out.println("Very excellent!!");
                    randomResponses();
                    break;
                }
            }
        question2();
        }

    public static void question2(){
        boolean flag = true;
        int number1 = 1+secureRandom.nextInt(9);
        int number2 = 1+secureRandom.nextInt(9);
        prompt("What is "+number1+ " times " +number2 +"?");
        int answer = scanner.nextInt();
        int result = number1 * number2;
    while (flag) {
//        flag = false;
        if (answer != result) {
//            System.out.println("No, please try again");
            randomMethod2();
            prompt("What is " + number1 + " times " + number2 + "?");
            answer = scanner.nextInt();
        } else {
//            System.out.println("Very excellent!!");
            randomResponses();
            break;
        }
    }
    }
    public static void randomResponses(){
        String randRes = "";
        int response = 1+random.nextInt(4);
        switch (response){
            case 1: randRes = "Very good!";
                System.out.println(randRes);
                break;
            case 2: randRes = "Excellent";
                System.out.println(randRes);
            case 3:randRes = "Nice work!";
                System.out.println(randRes);
            case 4: randRes = "Keep up the good work";
                System.out.println(randRes);
            default: break;
        }

    }

    private static void randomMethod2() {
        int response2 = 1+random.nextInt(4);
        switch (response2){
            case 1:
                System.out.println("No please try again");
            case 2:
                System.out.println("Wrong, try once more");
            case 3:
                System.out.println("Dont give up");
            case 4:
                System.out.println("No, keep trying");
            default: break;
        }
    }

    private static void prompt(String s) {
        System.out.println(s);
    }
}
