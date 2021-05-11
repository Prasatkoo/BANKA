package com.company;

public class Customer {
    private String name;
    private String pass;
    private String accounts;
    private int accmoney;

    public Customer(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCash(accmoney);

    }

    public void setAccmoney(int accmoney) {
        this.accmoney = accmoney;
    }

    public int getAccmoney() {
        return accmoney;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
