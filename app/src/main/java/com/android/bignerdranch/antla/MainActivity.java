package com.android.bignerdranch.antla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private String userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null){
            userEmail = currentUser.getEmail();
        }
        else {
            Intent intent = new Intent(getApplicationContext(), login.class);
            startActivity(intent);
        }
    }

    // this is method allows the users to view their budget account
    public void openBudgetAccount(View view){
        Intent intent = new Intent(getApplicationContext(), budget_account.class);
        startActivity(intent);
    }

    // this is method allows the users to view their savings_account account
    public void openSavingsAccount(){
        Intent intent = new Intent(getApplicationContext(), savings_account.class);
        startActivity(intent);
    }

    // this is method allows the users to view their goals account
    public void openGoalsAccount(){
        Intent intent = new Intent(getApplicationContext(), goals_account.class);
        startActivity(intent);
    }
}
