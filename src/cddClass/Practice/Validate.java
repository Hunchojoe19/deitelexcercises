package cddClass.Practice;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();

        System.out.println("Please enter your city: ");
        String city = scanner.nextLine();

        System.out.println("Please enter your state: ");
        String state = scanner.nextLine();

        System.out.println("Please enter your zip number: ");
        String zip = scanner.nextLine();

        System.out.println("Please enter phone number: ");
        String phoneNumber = scanner.nextLine();

        // validate user input and display error message
            System.out.printf("%nValidate Result:");

            if (!ValidateInput.validateFirstName(firstName)){
                System.out.println("Invalid first name");
            }
            else if (!ValidateInput.validateLastName(lastName)){
                System.out.println("Invalid last name");
            }
            else if (!ValidateInput.validateAddress(address)){
                System.out.println("Invalid Address");
            }
            else if (!ValidateInput.validateCity(city)){
                System.out.println("Invalid city");
            }
            else if (!ValidateInput.validateState(state)){
                System.out.println("Invalid state");
            }
            else if (!ValidateInput.validateZip(zip)){
                System.out.println("Invalid zip");
            }
            else if (!ValidateInput.validatePhoneNumber(phoneNumber)){
                System.out.println("Invalid phone number");
            }
    }
}
