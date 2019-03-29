package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListshowActivity extends AppCompatActivity {
    HashMap<String, ArrayList<String>> hashMap;
    String key1 = "01",key2 = "02";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listshow);
        ImageButton imageButton = findViewById(R.id.list_back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Bundle bundle = getIntent().getExtras();
        SerializableMap serializableMap = (SerializableMap) bundle.get("map");
        key1 = bundle.getString("01");
        key2 = bundle.getString("02");
        hashMap = serializableMap.getMap();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,hashMap.get(key1));
        ListView listView = findViewById(R.id.list_mm_ac1);
        listView.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,hashMap.get(key2));
        ListView listView1 = findViewById(R.id.list_mm_ac2);
        listView1.setAdapter(adapter1);
        TextView textView1 = findViewById(R.id.text_mm_ac1);
        TextView textView2 = findViewById(R.id.text_mm_ac2);
        textView1.setText(key1);
        textView2.setText(key2);

    }
}
