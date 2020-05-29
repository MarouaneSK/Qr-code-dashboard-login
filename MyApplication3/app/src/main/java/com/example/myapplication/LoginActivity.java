package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rey.material.widget.CheckBox;

import static com.example.myapplication.Scanner.resultData;

public class LoginActivity extends AppCompatActivity {

 public EditText phone_number;
 public EditText password;
 public Button loginBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        phone_number = (EditText) findViewById(R.id.login_phone_number_input);
        password=(EditText) findViewById(R.id.login_password_input);
        loginBtn=(Button) findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(phone_number.getText().toString().equals("01234") &&
                        password.getText() == resultData){
                    Toast.makeText(getApplicationContext(), "Redirecting...",
                            Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);

                }







            }
        });

    }
}
