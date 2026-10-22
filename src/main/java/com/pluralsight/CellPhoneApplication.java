package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        // * creating scanner for user input receiving
        Scanner sc = new Scanner(System.in);

        CellPhone phone = new CellPhone();
        System.out.print("What is the phone's serial number? : ");
        int serialNumber = sc.nextInt();
        sc.nextLine();
        phone.setSerialNumber(serialNumber);
        System.out.printf("\nSerial number: %d", phone.getSerialNumber());

        System.out.print("What is the phone's model? : ");
        String model = sc.nextLine();
        phone.setModel(model);
        System.out.printf("\nModel: %s", phone.getModel());

        System.out.print("What is the phone's carrier?");
        String phoneCarrier = sc.nextLine();
        phone.setCarrier(phoneCarrier);
        System.out.printf("\nCarrier: %s", phone.getCarrier());

        System.out.print("What is the phone's phone number?");
        String phoneNumber = sc.nextLine();
        phone.setPhoneNumber(phoneNumber);
        System.out.printf("Phone Number: %s", phone.getPhoneNumber());

        System.out.print("Who is the phone's owner?");
        String owner = sc.nextLine();
        phone.setOwner(owner);
        System.out.printf("Owner: %s", phone.getOwner());

    } // ! main method cBracket

} // ! main class cBracket
