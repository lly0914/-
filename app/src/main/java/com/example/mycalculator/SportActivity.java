package com.example.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SportActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);
        ImageButton imageButton = findViewById(R.id.sport_back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initView();
    }

    private void initView() {
        btn1 = findViewById(R.id.man12);
        btn2 = findViewById(R.id.man34);
        btn3 = findViewById(R.id.women12);
        btn4 = findViewById(R.id.women34);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        Bundle b;
        switch (v.getId()){
            case R.id.man12:
                i= new Intent(SportActivity.this,DetailActivity.class);
                b=new Bundle();
                b.putInt("sex_grade",0);
                b.putString("ytxs","引体向上");
                b.putString("nlp","1000米");
                i.putExtras(b);
                startActivity(i);
                break;
            case R.id.man34:
                i= new Intent(SportActivity.this,DetailActivity.class);
                b=new Bundle();
                b.putInt("sex_grade",1);
                b.putString("ytxs","引体向上");
                b.putString("nlp","1000米");
                i.putExtras(b);
                startActivity(i);
                break;
            case R.id.women12:
                i= new Intent(SportActivity.this,DetailActivity.class);
                b=new Bundle();
                b.putInt("sex_grade",2);
                b.putString("ytxs","仰卧起坐");
                b.putString("nlp","800米");
                i.putExtras(b);
                startActivity(i);
                break;
            case R.id.women34:
                i= new Intent(SportActivity.this,DetailActivity.class);
                b=new Bundle();
                b.putInt("sex_grade",3);
                b.putString("ytxs","仰卧起坐");
                b.putString("nlp","800米");
                i.putExtras(b);
                startActivity(i);
                break;

        }
    }
}
