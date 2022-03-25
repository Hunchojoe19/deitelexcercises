package tddClass;

import java.util.Scanner;

public class PhoneMenu {
    public static void main(String... args){
        Scanner huncho = new Scanner (System.in);
        System.out.println("""
                Menu
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim services
                    """);
        int phoneBook = huncho.nextInt();
        switch (phoneBook){
            case 1 -> {
                System.out.println("""
                        Phone book
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags""");
            int mad = huncho.nextInt();
            switch (mad){
                case 8: {
                    System.out.println("""
                            Options
                            1. Type of view
                            2. Memory status""");
                }
            }
            }
        }
        int messages = huncho.nextInt();
        switch (messages) {
            case 2:{
                System.out.println("""
                        Messages
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor""");
                int settings = huncho.nextInt();
                switch (settings){
                    case 1:{
                        System.out.println("1. Write message");
                        break;
                    }
                    case 2:{
                        System.out.println("2. Inbox");
                        break;
                    }
                    case 3:{
                        System.out.println("3. Outbox");
                        break;
                    }
                    case 4:{
                        System.out.println("4. Picture messages");
                        break;
                    }
                    case 5: {
                        System.out.println("5. Templates");
                        break;
                    }
                    case 6: {
                        System.out.println("6. Smileys");
                    }
                    case 7: {
                        System.out.println("""
                                Message settings
                                1. Set
                                2. Common""");
                        int free = huncho.nextInt();
                        switch (free){
                            case 1: {
                                System.out.println("1. Message centre number");
                                System.out.println("2. Messages sent");
                                System.out.println("3. Message validity");
                                break;
                            }
                            case 2: {
                                System.out.println("1. Delivery reports");
                                System.out.println("2. Reply via same centre");
                                System.out.println("3. Character support");

                            }
                        }break;
                    }
                    case 8: {
                        System.out.println("8. Info service");
                        break;
                    }
                    case 9: {
                        System.out.println("9. Voice mailbox number");
                        break;
                    }
                    case 10: {
                        System.out.println("10. Service command editor");
                        break;
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Chat");
            }
            case 4: {
                System.out.println("""
                        Call register
                        1. Missed calls
                        2. Received calls
                        3. Dialled calls
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit""");
                int call = huncho.nextInt();
                switch (call) {
                    case 5: {
                        System.out.println("1. Last call duration");
                        System.out.println("2. All calls' duration");
                        System.out.println("3. Received calls' duration");
                        System.out.println("4. Dialled calls' duration");
                        System.out.println("5. Clear timers");
                        break;
                    }
                    case 6: {
                        System.out.println("""
                                Show call costs
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters""");
                        break;
                    }
                    case 7: {
                        System.out.println("1. Call cost limit");
                        System.out.println("2. Show costs in");
                        break;
                    }
                    case 8:{
                        System.out.println("Prepaid credit");
                    }
                }
            }
            case 5:
            {System.out.println("""
                        Tones
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                break;
            }
            case 6: {
                System.out.println("""
                        Settings
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings""");
                int settings = huncho.nextInt();
                switch (settings){
                    case 1:{
                        System.out.println("Call settings");
                        System.out.println("1. Automatic redial");
                        System.out.println("2. Speed dialling");
                        System.out.println("3. Call waiting options");
                        System.out.println("4. Own number sending");
                        System.out.println("5. Phone line in use");
                        System.out.println("6. Automatic answer");
                        break;
                    }
                    case 2:{
                        System.out.println("Phone settings");
                        System.out.println("1. Language");
                        System.out.println("2. Cell info display");
                        System.out.println("3. Welcome note");
                        System.out.println("4. Network selection");
                        System.out.println("5. Lights");
                        System.out.println("6. Confirm SIM service actions");
                        break;
                    }
                    case 3:{
                        System.out.println("Security settings");
                        System.out.println("1. PIN code request");
                        System.out.println("2. Call barring service");
                        System.out.println("3. Fixed dialling");
                        System.out.println("4. Closed user group");
                        System.out.println("5. Phone security");
                        System.out.println("6. Change access codes");
                        break;
                    }
                }
            }
            case 7:{
                System.out.println("7. Call divert");
            }
            case 8: {
                System.out.println("8. Games");
            }
            case 9: {
                System.out.println("9. Calculator");
            }
            case 10:{
                System.out.println("10.Reminders");
            }
            case 11: {
                System.out.println("""
                        Clock
                        1. Alarm clock
                        2. Clock settings
                        3. Date settings
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time""");
                break;
            }
            case 12:{
                System.out.println("12. Profiles");
            }
            case 13:{
                System.out.println("13. SIM services");
            }
        }

    }
}
