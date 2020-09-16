package com.android.bignerdranch.antla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.paystack.android.PaystackSdk;

public class payment_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_page);
        PaystackSdk.initialize(getApplicationContext());
    }
}
