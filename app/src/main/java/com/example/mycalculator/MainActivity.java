package com.example.mycalculator;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();


    }
    public void findView(){
        btn1 = findViewById(R.id.simple);
        btn2 = findViewById(R.id.complex);
        btn3 = findViewById(R.id.sport);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.simple:
                intent = new Intent(MainActivity.this, SimpleActivity.class);
                startActivity(intent);
                break;
            case R.id.complex:
                intent = new Intent(MainActivity.this, ComplexActivity.class);
                startActivity(intent);
                break;
            case R.id.sport:
                intent = new Intent(MainActivity.this, SportActivity.class);
                startActivity(intent);
                break;
        }
    }
}