package com.example.kabutarchat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kabutarchat.R;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {
    private EditText lemail,lpassword;
    private Button login;
    private TextView forgotPassword,signupOption;
    private FirebaseAuth nauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        lemail=findViewById(R.id.login_email_input);
        lpassword=findViewById(R.id.login_password_input);
        login=findViewById(R.id.Login_button);
        forgotPassword=findViewById(R.id.forgot_password_link);
        signupOption=findViewById(R.id.signUp_option_link);

        signupOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this,SignUpActivity.class));
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this,Reset_Password_Activity.class));
            }
        });
    }
}