package com.example.mycalculator;


import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import parsii.eval.Parser;

public class SimpleActivity extends AppCompatActivity {

    private int[] idNum = {R.id.txt0, R.id.txt1, R.id.txt2, R.id.txt3,
            R.id.txt4, R.id.txt5, R.id.txt6, R.id.txt7, R.id.txt8, R.id.txt9};  //数字Number输入
    private int[] idCal = {R.id.txtPlus, R.id.txtMinus, R.id.txtMul, R.id.txtDiv,R.id.txtLeft,R.id.txtRight,R.id.txtDot};  //运算符
    private Button[] buttonsCal = new Button[idCal.length];
    private Button[] buttonsNum = new Button[idNum.length];
    private Button buttonEqu;   //=
    private Button buttonClear;  // AC
    private Button buttonDel;
    private EditText input ;
    private TextView output;
    private static String Text;
    @Override
    /**
     * EditText为输入字符行，
     * TextView为结果。
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        ImageButton imageButton = findViewById(R.id.simple_back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        input = (EditText)findViewById(R.id.input);
        input.setText("");
        input.setEnabled(false);
        output = (TextView) findViewById(R.id.output);
        output.setText("");
        buttonEqu = (Button)findViewById(R.id.txtIs);
        buttonEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input.getText().length() > 1)) {
                    Parser exp ;
                    String result;
                    try {
                        String a = input.getText().toString();
                        BigDecimal result_num = Parser.parse(a).evaluate();
                        result = String.valueOf(Double.parseDouble(result_num.toString()));
                    } catch (Exception ex) {
                        result = "出错";
                    }
                    output.setText(result);
                }

            }
        });
        buttonClear = (Button) findViewById(R.id.txtClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });
        buttonDel = (Button) findViewById(R.id.txtDel);

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!input.getText().toString().isEmpty() ) {
                    Text = input.getText().toString();
                    Text = Text.substring(0, Text.length() - 1);
                    input.setText(Text);
                }
            }
        });
/**
 * 注册单击事件
 */
        for (int idcal = 0; idcal < idCal.length; idcal++) {
            buttonsCal[idcal] = (Button) findViewById(idCal[idcal]);
            buttonsCal[idcal].setOnClickListener(new CalOnClick(buttonsCal[idcal].getText().toString()));

        }
        for (int i = 0; i < idNum.length; i++) {
            buttonsNum[i] = (Button) findViewById(idNum[i]);
            buttonsNum[i].setOnClickListener(new NumberOnClick(buttonsNum[i].getText().toString()));
        }




    }
    //继承OnClick接口
    class NumberOnClick implements View.OnClickListener {
        String Msg;
        /**
         *
         * @param msg 点击按钮传入字符
         */
        public NumberOnClick(String msg) {
            Msg = msg;
        }

        @Override
        public void onClick(View v) {
            if (!output.getText().toString().equals("")) {
                input.setText("");
                output.setText("");
            }

            input.append(Msg);
        }
    }
    class CalOnClick implements  View.OnClickListener{
        String Msg;
        String[] calSymbol = {"+", "-", "*", "/","."};
        public CalOnClick(String msg) {
            Msg = msg;
        }
        @Override
        public void onClick(View v) {
            if (!output.getText().toString().equals("")) {
                input.setText("");
                output.setText("");
            }
            // 检查是否运算符重复输入
            for (int i = 0; i < calSymbol.length; i++) {
                if (Msg.equals(calSymbol[i])) {
                    if (input.getText().toString().split("")
                            [input.getText().toString().split("").length - 1].equals(calSymbol[i])) {
                        Msg = "";
                    }

                }
            }
            input.append(Msg);
        }
    }

    /**
     * 运算类，返回一个String结果
     */
}
