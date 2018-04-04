package com.example.el_alamaya.gymathome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String welcome = getIntent().getExtras().getString("name").toString();
        Toast.makeText(SecondActivity.this,welcome,Toast.LENGTH_SHORT).show();

    }


}
