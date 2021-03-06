package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.Arrays;

import parsii.eval.Parser;

public class ComplexActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_point; //小数点
    Button btn_clear; //清除
    Button btn_del;   //删除
    Button btn_plus; //+
    Button btn_minus; //-
    Button btn_multiply; //*
    Button btn_divide; // /
    Button btn_equal; // =
    Button btn_left; // (
    Button btn_right; // )
    Button btn_sin, btn_cos, btn_tan, btn_lg, btn_ln, btn_pow, btn_square, btn_cube, btn_sqrt;
    private TextView output;
    EditText input;
    private StringBuilder formula = new StringBuilder();

    private void initView() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multiply = (Button) findViewById(R.id.btn_mul);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        input = (EditText) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);
        btn_lg = findViewById(R.id.btn_lg);
        btn_ln = findViewById(R.id.btn_ln);
        btn_pow = findViewById(R.id.btn_pow);
        btn_square = findViewById(R.id.btn_squre);
        btn_cube = findViewById(R.id.btn_cube);
        btn_sqrt = findViewById(R.id.btn_sqrt);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_tan.setOnClickListener(this);
        btn_ln.setOnClickListener(this);
        btn_lg.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_right.setOnClickListener(this);
        btn_square.setOnClickListener(this);
        btn_cube.setOnClickListener(this);
        btn_sqrt.setOnClickListener(this);
        btn_pow.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex);
        ImageButton imageButton = findViewById(R.id.complex_back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initView();
    }


    public void onClick(View v) {
        int last = 0;
        if(formula.length()!=0)
        {
            last = formula.codePointAt(formula.length()-1);

        }
        switch (v.getId()) {
            case R.id.btn_0:
                formula.append("0");
                break;
            case R.id.btn_1:
                formula.append("1");
                break;
            case R.id.btn_2:
                formula.append("2");
                break;
            case R.id.btn_3:
                formula.append("3");
                break;
            case R.id.btn_4:
                formula.append("4");
                break;
            case R.id.btn_5:
                formula.append("5");
                break;
            case R.id.btn_6:
                formula.append("6");
                break;
            case R.id.btn_7:
                formula.append("7");
                break;
            case R.id.btn_8:
                formula.append("8");
                break;
            case R.id.btn_9:
                formula.append("9");
                break;
            case R.id.btn_plus:
                //if (last >= '0' && last <= '9' ) {
                formula.append("+");
                // }
                break;
            case R.id.btn_minus:
                //if (last >= '0' && last <= '9') {
                formula.append("-");
                //  }
                break;
            case R.id.btn_mul:
                // if (last >= '0' && last <= '9' ) {
                formula.append("*");
                // }
                break;
            case R.id.btn_divide:
                // if (last >= '0' && last <= '9' ) {
                formula.append("/");
                // }
                break;
            case R.id.btn_sin:
                formula.append("sin(");
                break;
            case R.id.btn_cos:
                formula.append("cos(");
                break;
            case R.id.btn_tan:
                formula.append("tan(");
                break;
            case R.id.btn_point:
                if (judge_point()) {
                    formula.append(".");
                }
                break;
            case R.id.btn_lg:
                formula.append("lg(");
                break;
            case R.id.btn_ln:
                formula.append("ln(");
                break;
            case R.id.btn_pow:
                formula.append("^");
                break;
            case R.id.btn_squre:
                formula.append("^2");
                break;
            case R.id.btn_cube:
                formula.append("^3");
                break;
            case R.id.btn_sqrt:
                formula.append("sqrt(");
                break;
            case R.id.btn_left:
                formula.append("(");
                break;
            case R.id.btn_right:
                formula.append(")");
                break;
            case R.id.btn_del: //删除
                if (formula.length() != 0) {
                    formula.delete(formula.length() - 1, formula.length());
                }
                break;
            case R.id.btn_clear: //清空
                formula.delete(0, formula.length());
                output.setText(formula);
                break;
            case R.id.btn_equal: // =等于
                if ((formula.length() > 1)) {
                    Parser exp ;
                    String result;
                    try {
                        String a = formula.toString();
                        BigDecimal result_num = Parser.parse(a).evaluate();
                        result = String.valueOf(Double.parseDouble(result_num.toString()));
                    } catch (Exception ex) {
                        result = "出错";
                    }

                    output.setText(result);
                    formula.delete(0, formula.length());
                    if (Character.isDigit(result.charAt(0))) {
                        formula.append(result);
                    }
                }
                break;
            default:
                break;
        }
        input.setText(formula);
    }
    //计算式最后一个符号不能是.
    private boolean judge_point() {
        String a = "+-*/%.";
        int[] b = new int[a.length()];
        int max;
        for (int i = 0; i < a.length(); i++) {
            b[i] = -1;
            String c = "" + a.charAt(i);
            b[i] = formula.lastIndexOf(c);
        }
        Arrays.sort(b);
        //最后一个是不是点
        if (b[a.length() - 1] == -1) {
            max = 0;
        } else {
            max = b[a.length() - 1];
        }

        if (formula.indexOf(".", max) == -1) {
            return true;
        } else {
            return false;
        }
    }
    private int judge_brackets(){
        int a=0,b=0;
        for(int i = 0 ; i < formula.length() ;i++){
            if(formula.charAt(i)=='(' ) {
                a++;
            }
            if(formula.charAt(i)==')' ) {
                b++;
            }
        }
        if(a == b)
            return 0;
        if(a > b)
            return 1;
        return 2;
    }
}
