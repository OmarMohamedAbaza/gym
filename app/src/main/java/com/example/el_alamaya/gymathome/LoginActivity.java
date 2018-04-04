package com.example.el_alamaya.gymathome;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Intent i ;
    private EditText nameField ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void signIn(View v){
        nameField = findViewById(R.id.editText);
        String n = nameField.getText().toString();
        i = new Intent(LoginActivity.this,SecondActivity.class);
        i.putExtra("name","WELCOME TO US " + n );
        startActivity(i);
    }

    public void signup(View v){
        Dialog d = new Dialog(LoginActivity.this);
        d.setContentView(R.layout.signup);
        d.show();

    }

}
