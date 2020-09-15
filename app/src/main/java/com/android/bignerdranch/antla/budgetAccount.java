package com.android.bignerdranch.antla;

import java.util.ArrayList;

public class budgetAccount extends Account {
    private String paymentInterval; // ths value could be daily, weekly or monthly
    private ArrayList<Expense> expenses = new ArrayList<>();
    private String nextPaymentDate;  // the date of the next automatic pay out

    public String getPaymentInterval() {
        return paymentInterval;
    }

    public void setPaymentInterval(String paymentInterval) {
        this.paymentInterval = paymentInterval;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }
}
