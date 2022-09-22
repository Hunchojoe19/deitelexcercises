package tddClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDiary {
    static int choice = 1;
    private static Scanner input = new Scanner(System.in);
    private static Diary diary = new Diary("Huncho", "Huncho@134", "Huncho@gmail.com", true);

    public static void main(String[] args) {
        register();
        logIn();
        openDiary();

        }
    private static void logIn() {
        diary.isLock();
        System.out.println("Welcome back " + diary.getUserName());

        System.out.println("Enter password");
        String password =  input.next();

        if (password.equals(diary.setPassword())){
            openDiary();
        }
        else {System.out.println("incorrect password");
            logIn();}
    }

    private static void register(){
        System.out.println("Enter your name: ");
        String userName = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.nextLine();

        System.out.println("add email address: ");
        String email = input.nextLine();
        System.out.println("\n".repeat(2));

        diary = new Diary(userName,password,email, true);
    }

    private static void openDiary() {
        System.out.println("Welcome!!!");
        boolean quit = false;
        choice = 1;
        printFrontPage();
        while (!quit){
            System.out.println("\n".repeat(1));
            System.out.println("Enter your choice ");
            try {
                choice = input.nextInt();
            }
            catch (InputMismatchException exception){
                System.out.println("Please Enter the options from 1 to 7");
            }

            input.nextLine();
            switch (choice){
                case 1: printFrontPage();
                        break;
                case 2: createNewEntries();
                        break;
                case 3: modifyEntries();
                        break;
                case 4: deleteAnEntry();
                        break;
                case 5: findEntries();
                        break;
                case 6: viewAllEntries();
                        break;
                case 7: {
                    System.out.println("Goodbye");
                    quit = true;
                }
                default:
                    openDiary();
            }
        }
    }

    private static void viewAllEntries() {
        diary.printEntriesInDiary();
    }

    private static void findEntries() {
        System.out.println("Enter title of entry you want to search: ");
        String userInput = input.nextLine();
        if (diary.searchEntries(userInput) != null) {
            System.out.println("found "+ userInput);
        }
        else {
            System.out.println(userInput + " not found.");
        }
    }

    private static void deleteAnEntry() {
        System.out.print("Enter current entry you want to be deleted: ");
        String userInput = input.nextLine();
        Entry existingEntry = diary.searchEntries(userInput);
        if (existingEntry == null) {
            System.out.println("Entry not found");
        }
            diary.deleteEntries(existingEntry);

    }

    private static void modifyEntries() {
        System.out.print("Enter current entry you want to be replaced: ");
        String userInput = input.nextLine();
        Entry existingEntry = diary.searchEntries(userInput);
        if (existingEntry == null) {
            System.out.println("Entry not found");
        }
        System.out.print("Enter the entry you want to replace with: ");
        String option = input.nextLine();
        System.out.print("Enter the body of the entry to be replaced with: ");
        String leggo = input.nextLine();
        Entry newEntry = Entry.createEntry(option, leggo);
       if (diary.updateEntries(existingEntry, newEntry)){
           System.out.println("Successfully updated entry");
       }
       else {
           System.out.println("Error updating entry, try again later...");
       }

    }

    private static void createNewEntries() {
        System.out.println("Please enter the title of your entry: ");
        String userInput = input.nextLine();

        System.out.println("Enter the body of your entry: ");
        String outside = input.nextLine();

        Entry newEntry = diary.entryCanBeCreated(userInput,outside);
        diary.addEntries(newEntry);
        System.out.print(userInput + " Have been created successfully");
    }

    private static void printFrontPage() {
        System.out.print("\nPress");
        System.out.print("\n 1 -> To display the options");
        System.out.print("\n 2 -> Create new entry ");
        System.out.print("\n 3 -> Modify entry");
        System.out.print("\n 4 -> Delete entries");
        System.out.print("\n 5 -> Find entry");
        System.out.print("\n 6 -> View entries");
        System.out.print("\n 7 -> exit");
    }
}
