package com.company;

import java.util.Random;

public class Bank {
    private int airBank;
    private int kmb;
    private int accountCreate;


    public Bank() {
        Random random = new Random();
        int x = random.nextInt(99999999);
        setAirBank(3100);
        setKmb(2020);
        setAccountCreate(x);
    }


    public int getAirBank() {
        return airBank;
    }

    public int getKmb() {
        return kmb;
    }


    public int getAccountCreate() {
        return accountCreate;
    }


    public void setAccountCreate(int accountCreate) {
        this.accountCreate = accountCreate;
    }


    public void setAirBank(int airBank) {
        this.airBank = airBank;
    }

    public void setKmb(int kmb) {
        this.kmb = kmb;
    }

}
