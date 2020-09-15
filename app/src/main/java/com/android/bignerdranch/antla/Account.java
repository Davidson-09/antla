package com.android.bignerdranch.antla;

import java.util.ArrayList;

public class Account {
    String name;
    String dateCeated;
    ArrayList<Transaction> transactions = new ArrayList<>();
    long balance;
    boolean active = true;

    public  Account(){
        // for firebase
    }

    public Account(String name, String dateCeated, ArrayList<Transaction> transactions, long balance, boolean active) {
        this.name = name;
        this.dateCeated = dateCeated;
        this.transactions = transactions;
        this.balance = balance;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCeated() {
        return dateCeated;
    }

    public void setDateCeated(String dateCeated) {
        this.dateCeated = dateCeated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void deposit(long amount){
        long newBalance = balance + amount;
        setBalance(newBalance);
    }

    public void withdraw(long amount){
        long newBalance = balance - amount;
        setBalance(newBalance);
    }
}
