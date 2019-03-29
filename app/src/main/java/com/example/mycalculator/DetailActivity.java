package com.example.mycalculator;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.dpizarro.uipicker.library.picker.PickerUI;
import com.dpizarro.uipicker.library.picker.PickerUISettings;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import parsii.eval.Parser;
import parsii.tokenizer.ParseException;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    private int currentPosition1 = -1;
    private PickerUI mPickerUI1;
    HashMap<String, ArrayList<String>> hashMap;
    Button btn;
    Button btn_md;
    EditText editText_1000_m;
    EditText editText_fhl;
    EditText editText_height;
    EditText editText_weight;
    EditText editText_zwtqu;
    EditText editText_50;
    EditText editText_ytxs;
    EditText editText_1000_s;
    EditText editText_jump;
    TextView score;
    CheckBox checkBox_1000;
    CheckBox checkBox_fhl;
    CheckBox checkBox_ytxs;
    CheckBox checkBox_bmi;
    CheckBox checkBox_zwtqu;
    CheckBox checkBox_50;
    CheckBox checkBox_jump;
    CheckBox checkBox_md;
    CheckBox checkBox_yjdg;
    int index;
    List<String> options;


    private void initViews() {
        checkBox_yjdg = findViewById(R.id.yjdg);
        btn_md = findViewById(R.id.btn_mubiaomd);
        checkBox_md = findViewById(R.id.check_md);
        mPickerUI1 = findViewById(R.id.picker_ui_view1);
        editText_1000_m = findViewById(R.id.text_mins);
        editText_1000_s = findViewById(R.id.text_s);
        editText_50 = findViewById(R.id.text_50);
        editText_fhl = findViewById(R.id.txt_fhl);
        editText_height = findViewById(R.id.height);
        editText_weight = findViewById(R.id.weight);
        editText_jump = findViewById(R.id.text_jump);
        editText_zwtqu = findViewById(R.id.text_zwtqu);
        editText_ytxs = findViewById(R.id.text_ytxs);
        checkBox_1000 = findViewById(R.id.check_mile);
        checkBox_fhl = findViewById(R.id.check_fhl);
        checkBox_ytxs = findViewById(R.id.check_ytxs);
        checkBox_bmi = findViewById(R.id.check_bmi);
        checkBox_zwtqu = findViewById(R.id.check_zwtqu);
        checkBox_50 = findViewById(R.id.check_50);
        checkBox_jump = findViewById(R.id.check_jump);
        score = findViewById(R.id.detail_score);
        btn = findViewById(R.id.sport_submit);
        btn.setOnClickListener(this);
        btn_md.setOnClickListener(this);
        mPickerUI1.setItems(this, options);//设置选项
        mPickerUI1.setColorTextCenter(R.color.background_panel_pickerui);
        mPickerUI1.setColorTextNoCenter(R.color.background_panel_pickerui);
        mPickerUI1.setBackgroundColorPanel(R.color.background_panel_pickerui);
        mPickerUI1.setLinesColor(R.color.background_panel_pickerui);
        mPickerUI1.setItemsClickables(false);
        mPickerUI1.setAutoDismiss(false);
        checkBox_yjdg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_yjdg.isChecked()){
                    checkBox_1000.setChecked(true);
                    checkBox_fhl.setChecked(true);
                    checkBox_ytxs.setChecked(true);
                    checkBox_bmi.setChecked(true);
                    checkBox_zwtqu.setChecked(true);
                    checkBox_50.setChecked(true);
                    checkBox_jump.setChecked(true);
                }else {
                    checkBox_1000.setChecked(false);
                    checkBox_fhl.setChecked(false);
                    checkBox_ytxs.setChecked(false);
                    checkBox_bmi.setChecked(false);
                    checkBox_zwtqu.setChecked(false);
                    checkBox_50.setChecked(false);
                    checkBox_jump.setChecked(false);
                }

            }
        });
        mPickerUI1.setOnClickItemPickerUIListener(
                new PickerUI.PickerUIItemClickListener() {

                    @Override
                    public void onItemClickPickerUI(int which, int position, String valueResult) {
                        currentPosition1 = position;
                        if(checkBox_md.isChecked()){
                            Toast.makeText(getApplicationContext(), valueResult, Toast.LENGTH_SHORT).show();
                            btn_md.setText(valueResult);

                        }
                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_mubiaomd:
                PickerUISettings pickerUISettings =
                        new PickerUISettings.Builder().withItems(options)
                                .withAutoDismiss(true)
                                .withItemsClickables(true)
                                .withUseBlur(false)
                                .build();

                mPickerUI1.setSettings(pickerUISettings);
                if(currentPosition1==-1) {
                    mPickerUI1.slide();
                }
                else{
                    mPickerUI1.slide(currentPosition1);
                }
                break;
            case R.id.sport_submit:
                if(judge_chech()<5){
                    btn.setText("重新提交");
                }else if(judge_chech()==7){
                    String result = grade();
                    score.setText(result);
                }else if(judge_chech()==5&checkBox_md.isChecked()){
                    String result = grade()+"-"+mubiao();
                    Parser exp ;
                    Double result2 = 0.0;
                    try {

                        BigDecimal result_num = Parser.parse(result).evaluate();
                        result2 = Math.abs(Double.parseDouble(result_num.toString()));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    List<String> list = new ArrayList<>();
                    if(!checkBox_50.isChecked()){
                         list.add("dp");
                    }
                    if(!checkBox_1000.isChecked()){
                        list.add("nlp");
                    }
                    if(!checkBox_bmi.isChecked()){
                        list.add("bmi");
                    }
                    if(!checkBox_fhl.isChecked()){
                        list.add("fhl");
                    }
                    if(!checkBox_jump.isChecked()){
                        list.add("jump");
                    }
                    if(!checkBox_ytxs.isChecked()){
                        list.add("ytxs");
                    }
                    if(!checkBox_zwtqu.isChecked()){
                        list.add("zwtqq");
                    }
                    get_best_solution(list.get(0),list.get(1),result2);
                    get_view(list.get(0),list.get(1));

                }else if(judge_chech()==6){

                }
                break;
        }
    }

    private String mubiao() {
        if (checkBox_md.isChecked()) {
            String key = btn_md.getText().toString();
            switch (key){
                case "20":
                    return"60";
                case "40":
                    return "80";
                case "80":
                    return "90";

            }
        }
        return null;
    }

    private void get_view(String key1,String key2) {
        Intent intent = new Intent(DetailActivity.this, ListshowActivity.class);
        final SerializableMap myMap=new SerializableMap();
        System.out.println(hashMap);
        myMap.setMap(hashMap);//将map数据添加到封装的myMap中
        Bundle bundle=new Bundle();
        bundle.putSerializable("map", myMap);
        bundle.putString("01",key1);
        bundle.putString("02",key2);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public String grade(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("nlp","0.2");
        hashMap.put("bmi","0.15");
        hashMap.put("fhl","0.15");
        hashMap.put("zwtqu","0.1");
        hashMap.put("jump","0.1");
        hashMap.put("ytxs","0.1");
        hashMap.put("dp","0.2");
        String nlp = "0",dp="0",zwtqq="0",ytxs_ywqz="0",fhl="0",bmi="0",jump="0";
        if(!TextUtils.isEmpty(editText_1000_s.getText())&&!TextUtils.isEmpty(editText_1000_m.getText())){
            String npl2 = editText_1000_m.getText().toString()+editText_1000_s.getText().toString();
            nlp = get_grade("nlp",Double.parseDouble(npl2.toString()));
        }

        if(!TextUtils.isEmpty(editText_50.getText())&&checkBox_50.isChecked()){

            dp = get_grade("dp",Double.parseDouble(editText_50.getText().toString()));
        }
        if(!TextUtils.isEmpty(editText_zwtqu.getText())&&checkBox_zwtqu.isChecked()){
            zwtqq = get_grade("zwtqq",Double.parseDouble(editText_zwtqu.getText().toString()));
        }
        if(!TextUtils.isEmpty(editText_ytxs.getText())&&checkBox_ytxs.isChecked()){
            ytxs_ywqz = get_grade("ytxs",Double.parseDouble(editText_ytxs.getText().toString()));
        }
        if(!TextUtils.isEmpty(editText_fhl.getText())&&checkBox_fhl.isChecked()){
            fhl = get_grade("fhl",Double.parseDouble(editText_fhl.getText().toString()));
        }

        Parser exp ;
        String result;
        try {
            String weight = "0",height="1";
            if(!TextUtils.isEmpty(editText_weight.getText())&&checkBox_bmi.isChecked()){
                weight = editText_weight.getText().toString();
            }
            if(!TextUtils.isEmpty(editText_height.getText())&&checkBox_bmi.isChecked()){
                height = editText_height.getText().toString();
            }

            String a = weight+"/(("+height+"/100)^2)";

            BigDecimal result_num = Parser.parse(a).evaluate();
            result = String.valueOf(Double.parseDouble(result_num.toString()));
        } catch (Exception ex) {
            result = "出错";
        }

        bmi = get_grade("bmi",Double.parseDouble(result));
        if(!TextUtils.isEmpty(editText_jump.getText())&&checkBox_jump.isChecked()){
            jump = get_grade("jump",Double.parseDouble(editText_jump.getText().toString()));
        }

        String exps = nlp+"*"+hashMap.get("nlp")+"+"+dp+"*"+"+"+hashMap.get("dp")+"+"+bmi+"*"+hashMap.get("bmi")+"+"+fhl+"*"+hashMap.get("fhl")+"+"+
                ytxs_ywqz+"*"+hashMap.get("ytxs")+"+"+zwtqq+"*"+hashMap.get("zwtqu")+"+"+jump+"*"+hashMap.get("jump");
        BigDecimal result_num2 = null;
        try {
            result_num2 = Parser.parse(exps).evaluate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        result = String.valueOf(Double.parseDouble(result_num2.toString()));
        return result;

    }
    public String get_grade(String key,Double value){
        MyUnit myUnit = new MyUnit();

        return  myUnit.getGrade(key,value,index);

    }
    protected int judge_chech(){
        int num = 0;
        if(checkBox_50.isChecked()){
            num+=1;
        }
        if(checkBox_1000.isChecked()){
            num+=1;
        }
        if(checkBox_zwtqu.isChecked()){
            num+=1;
        }
        if(checkBox_ytxs.isChecked()){
            num+=1;
        }
        if(checkBox_bmi.isChecked()){
            num+=1;
        }
        if(checkBox_jump.isChecked()){
            num+=1;
        }
        if(checkBox_fhl.isChecked()){
            num+=1;
        }

        return num;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
        Intent i =getIntent();
        Bundle data=i.getExtras();
        index = data.getInt("sex_grade");
        String ytxs = data.getString("ytxs");
        String nlp = data.getString("nlp");
        TextView textView1 = findViewById(R.id.text_nlp);
        TextView textView2 = findViewById(R.id.tex_ytxs);
        textView1.setText(nlp);
        textView2.setText(ytxs);
        options = Arrays.asList(getResources().getStringArray(R.array.mianduan));
    }
    public void get_best_solution(String key1,String key2,double lest){
        MyUnit myUnit = new MyUnit();
        hashMap = myUnit.get_best_solution(key1,key2,lest,index);
    }
}
