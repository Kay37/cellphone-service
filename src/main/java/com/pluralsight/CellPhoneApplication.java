package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {

        // * creating scanner for user input receiving
        Scanner sc = new Scanner(System.in);
        // * using CellPhone type / class to create a new CellPhone object under variable name phone
        CellPhone phone = new CellPhone();

        // TODO: Prompting users for information about their phone, and using setters to set the provided info
        System.out.print("What is the phone's serial number? : ");
        int serialNumber = sc.nextInt();
        sc.nextLine();
        phone.setSerialNumber(serialNumber);


        System.out.print("\nWhat is the phone's model? : ");
        String model = sc.nextLine();
        phone.setModel(model);


        System.out.print("\nWhat is the phone's carrier? : ");
        String phoneCarrier = sc.nextLine();
        phone.setCarrier(phoneCarrier);


        System.out.print("\nWhat is the phone's phone number? : ");
        String phoneNumber = sc.nextLine();
        phone.setPhoneNumber(phoneNumber);


        System.out.print("\nWho is the phone's owner? : ");
        String owner = sc.nextLine();
        phone.setOwner(owner);


        //TODO - Using getters to display the set information to the users
        System.out.printf(makeColorScheme(GREEN, "\nSerial Number: %d"), phone.getSerialNumber());
        System.out.printf(makeColorScheme(BLUE, "\nModel: %s"), phone.getModel());
        System.out.printf(makeColorScheme(RED, "\nCarrier: %s\n"), phone.getCarrier());
        System.out.printf(makeColorScheme(GREEN, "Phone Number: %s\n"), phone.getPhoneNumber());
        System.out.printf(makeColorScheme(BLUE, "Owner: %s\n"), phone.getOwner());

    } // ! main method cBracket

    public static String makeColorScheme(String color, String originalMessage) {
        return color + originalMessage + RESET;
    }

} // ! main class cBracket
