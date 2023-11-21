package com.example.intenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonToast, buttonHello, buttonSianida, buttonTwoActivity,buttonSetAlarm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = findViewById(R.id.buttonToast);
        buttonHello = findViewById(R.id.buttonHello);
        buttonSianida = findViewById(R.id.buttonSianida);
        buttonTwoActivity = findViewById(R.id.buttonTwoActivity);
        buttonSetAlarm = findViewById(R.id.buttonSetAlarm);

        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this,halloActivity.class);
                startActivity(h);
            }
        });

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,hellotoastActivity.class);
                startActivity(i);
            }
        });

        buttonSianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this,scrollingTextActivity.class);
                startActivity(s);
            }
        });
        buttonTwoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this, fisrttwoActivity.class);
                startActivity(t);
            }
        });
        buttonSetAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, alarmActivity.class);
                startActivity(a);
            }
        });
    }
}