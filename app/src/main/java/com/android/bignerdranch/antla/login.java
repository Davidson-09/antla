package com.android.bignerdranch.antla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private String loginEmail;
    private String loginPassword;

    private EditText enterEmail;
    private EditText enterPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        enterEmail = findViewById(R.id.login_email);
        enterPassword = findViewById(R.id.login_password);
    }

    public void login(View view){
        loginEmail = enterEmail.getText().toString();
        loginPassword = enterPassword.getText().toString();

        if (loginEmail.trim().isEmpty() || loginPassword.isEmpty()){
            Toast.makeText(this, "incomplete information", Toast.LENGTH_SHORT).show();
        }else {
            mAuth.signInWithEmailAndPassword(loginEmail, loginPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }


    public void signUp(View view){
        Intent intent = new Intent(getApplicationContext(), Register.class);
        startActivity(intent);
    }
}
