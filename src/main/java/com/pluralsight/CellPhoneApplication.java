package com.pluralsight;


// ! Importing Scanner for Scanner object creation that will receive user input
import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        // * creating Scanner object for retrieving user input
        Scanner sc = new Scanner(System.in);

        CellPhone nokiaActionman = new CellPhone();
        CellPhone nokiaActionmanII = new CellPhone();
        CellPhone nokiaActionmanIII = new CellPhone(1234569, "Nokia ActionmanIII", "Verizon", "(345)-678-9012", "Joe Fadduh");
        // TODO: Prompting users for information about their phone, and using setters to set the provided info
        System.out.print("What is the phone's serial number? : ");
        int serialNumber = sc.nextInt();
        sc.nextLine();
        nokiaActionman.setSerialNumber(serialNumber);
        nokiaActionmanII.setSerialNumber(serialNumber + 1);

        System.out.print("\nWhat is the phone's model? : ");
        String model = sc.nextLine();
        nokiaActionman.setModel(model);
        nokiaActionmanII.setModel(model + " II");


        System.out.print("\nWhat is the phone's carrier? : ");
        String phoneCarrier = sc.nextLine();
        nokiaActionman.setCarrier(phoneCarrier);
        nokiaActionmanII.setCarrier(phoneCarrier);

        System.out.print("\nWhat is the phone's phone number? : ");
        String phoneNumber = sc.nextLine();
        nokiaActionman.setPhoneNumber(phoneNumber);
        System.out.print("\nWhat is the second phone's number? : ");
        String phoneNumberII = sc.nextLine();
        nokiaActionmanII.setPhoneNumber(phoneNumberII);

        System.out.print("\nWho is the phone's owner? : ");
        String owner = sc.nextLine();
        nokiaActionman.setOwner(owner);
        nokiaActionmanII.setOwner("Joe Momma");

        //TODO: Use a display method to display information about the phone using getters.
        display(nokiaActionman);
        display(nokiaActionmanII);
        display(nokiaActionmanIII);

        //TODO: Dial a phone number using our dial method
        System.out.println("\nPlease enter a phone number to dial: ");
        String numberToCall = sc.nextLine();
        nokiaActionman.dial(numberToCall);
        // * phone 1 dials phone 2, then phone 2 dials phone 1
        nokiaActionman.dial(nokiaActionmanII);
        nokiaActionmanII.dial(nokiaActionman);
        nokiaActionman.dial(nokiaActionmanIII);

    } // ! main method cBracket

    public static void display(CellPhone phone) {
        System.out.printf( "\nSerial Number: %d", phone.getSerialNumber());
        System.out.printf( "\nModel: %s", phone.getModel());
        System.out.printf( "\nCarrier: %s\n", phone.getCarrier());
        System.out.printf( "Phone Number: %s\n", phone.getPhoneNumber());
        System.out.printf( "Owner: %s\n", phone.getOwner());
    }

} // ! main class cBracket
