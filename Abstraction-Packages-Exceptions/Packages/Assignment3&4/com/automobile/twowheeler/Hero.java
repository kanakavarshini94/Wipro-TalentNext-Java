package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {


    public String getModelName() {
        return "Hero Splendor";
    }


    public String getRegistrationNumber() {
        return "AP12345";
    }


    public String getOwnerName() {
        return "Varshini";
    }


    public int getSpeed() {
        return 80;
    }


    public void radio() {
        System.out.println("Hero bike radio is ON");
    }

}