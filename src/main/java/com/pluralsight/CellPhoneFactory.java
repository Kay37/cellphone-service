package com.pluralsight;


// ! Importing Scanner for Scanner object creation that will receive user input
import java.util.Scanner;

public class CellPhoneFactory {

    public static void main(String[] args) {

        // * creating Scanner object for retrieving user input
        Scanner sc = new Scanner(System.in);

        CellPhoneBlueprints nokiaActionman = new CellPhoneBlueprints();

        // TODO: Prompting users for information about their phone, and using setters to set the provided info
        System.out.print("What is the phone's serial number? : ");
        int serialNumber = sc.nextInt();
        sc.nextLine();
        nokiaActionman.setSerialNumber(serialNumber);


        System.out.print("\nWhat is the phone's model? : ");
        String model = sc.nextLine();
        nokiaActionman.setModel(model);


        System.out.print("\nWhat is the phone's carrier? : ");
        String phoneCarrier = sc.nextLine();
        nokiaActionman.setCarrier(phoneCarrier);


        System.out.print("\nWhat is the phone's phone number? : ");
        String phoneNumber = sc.nextLine();
        nokiaActionman.setPhoneNumber(phoneNumber);


        System.out.print("\nWho is the phone's owner? : ");
        String owner = sc.nextLine();
        nokiaActionman.setOwner(owner);

        //TODO: Use a display method to display information about the phone using getters.
        display(nokiaActionman);
        display(nokiaActionman);

        //TODO: Dial a phone number using our dial method
        System.out.println("\nPlease enter a phone number to dial: ");
        String numberToCall = sc.nextLine();
        nokiaActionman.dial(numberToCall);

    } // ! main method cBracket

    public static void display(CellPhoneBlueprints nokiaActionman) {
        System.out.printf( "\nSerial Number: %d", nokiaActionman.getSerialNumber());
        System.out.printf( "\nModel: %s", nokiaActionman.getModel());
        System.out.printf( "\nCarrier: %s\n", nokiaActionman.getCarrier());
        System.out.printf( "Phone Number: %s\n", nokiaActionman.getPhoneNumber());
        System.out.printf( "Owner: %s\n", nokiaActionman.getOwner());
    }

} // ! main class cBracket
