package com.pluralsight;

// ! this class is my blueprint for creating CellPhone object instances.

public class CellPhone {

    // ! Fields: private, no values yet
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // ! Constructor: runs on "new CellPhone()"
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // ! Getters and setters - the order we list our getters and setters does not matter.
    // ! Even though it makes sense for setters to come before getters, the order we
    // ! list that info is not linear.
    // * Getters and setters are Java's way of accessing private information.
    // * My fields are private, which means main can't access those fields directly.
    // * A comparison: a vault is the private field. I can't walk in and grab money myself.
    // * The teller is the getter or setter. Anyone can walk up to the teller and ask
    // * "I'd like to deposit.." is a setter. "What's my balance?" is a getter.
    // * The teller can say no. The bank decides if there's a bank teller window at all.
    // * Bank can decide no withdraw window, no deposit window, etc.
    // * If you write a getter but no setter, the field becomes read-only.
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

}

