package com.android.bignerdranch.antla;

public class User {
    private String name;
    private String email;
    private long totalBalance;
    private budgetAccount budget;
    private savingsAccount savings;
    //goalAccount goals;

    public User(){
        // for firebase
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
    }

    public budgetAccount getBudget() {
        return budget;
    }

    public void setBudget(budgetAccount budget) {
        this.budget = budget;
    }

    public savingsAccount getSavings() {
        return savings;
    }

    public void setSavings(savingsAccount savings) {
        this.savings = savings;
    }
}
