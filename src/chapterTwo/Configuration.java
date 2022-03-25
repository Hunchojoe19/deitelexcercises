package chapterTwo;

import java.util.Scanner;

public class Configuration {
    public static void main(String... args){
        Scanner global = new Scanner(System.in);
        System.out.println("""
                         Hello Thecla, 
                         Press:
                         1. - -> login
                         2. - -> register
                         3. - -> logout
                         4. - -> exit""");
          int input = global.nextInt();
          switch (input){
              case 1: {
                  System.out.println("Enter your username:");
                  global.next();
                  System.out.println("Enter your password:");
                  global.next();
                  System.out.println("login successful");
                  System.out.println("\n".repeat(3));
                  break;
                  }

              case 2: {
                  System.out.println("have you been registered before?");
                  System.out.println("""
                          Click: 
                          1. Yes.
                          2. No.""");
                 int plug = global.nextInt();
                  switch(plug){
                      case 1:{
                          System.out.println("Enter registered username:");
                          global.next();
                          System.out.println("Enter registered password:");
                          global.next();
                          System.out.println("login successful");}
                          break;
                      case 2:
                      {System.out.println("please you need to register before you can login.");
                          System.out.println("Enter username:");
                          global.next();
                          System.out.println("Enter password:");
                          global.next();
                          System.out.println("Enter to confirm password:");
                          global.next();
                          System.out.println("congratulations, you have been registered successfully");
                          }
                  }
              } break;
              case 3: {
                  System.out.println("You have been logged out successfully");}
              break;
              case 4:
              {System.out.println("account have been exited successfully");
                  break;}
              default:
                  System.out.println("Error");
                  System.out.println("please input one of the above options");
          }
        }
    }
