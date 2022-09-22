package cddClass.Practice;

import java.util.Scanner;

public class Switch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        printMenu();

        int user = scanner.nextInt();
        switch (user) {
            case 1 : register();
            case 2: exit();
        }
    }
    public static void register(){
        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("welcome "+ name);

    }
    public static void exit(){
        System.out.println("Press 1 to exit or 2 to continue");
        int button = scanner.nextInt();
//        scanner.next();
//        switch (button) {
//            case 1:
//                System.out.println("Exit successful");
//                break;
//            case 2: printMenu();
//            break;
//        }
        if (button == 1){
            System.out.println("Exit successful");
        }
        else if (button == 2){
            printMenu();
        }

    }
    public static void printMenu(){
        System.out.println("""
                Please Press any button
                1. register
                2. exit""");


    }
}
