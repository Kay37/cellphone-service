package com.pluralsight;

public class CellPhone {

    // ! Fields: private, no values yet. Java makes a fresh empty cell phone blueprint with 5 empty fields. A field is
    // ! a variable written inside the class but outside any method.
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // ! java runs, if called, the constructor that we built. It sets/initiates the declared fields above
    // ! to the below values.
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // ! creating a dial Method! It will accept a phone number that we have stored/will store
    // ! in a String called numberToCall. It will then display the message "Owner's phone is calling..."
    public void dial (String numberToCall) {
        System.out.printf("%s's phone is calling %s%n", owner, numberToCall);
    }
    public void dial (CellPhone phone) {
        String numberToCall = phone.getPhoneNumber();
        dial(numberToCall);
    }
}

