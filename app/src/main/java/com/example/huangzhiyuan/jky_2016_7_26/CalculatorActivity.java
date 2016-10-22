package com.example.huangzhiyuan.jky_2016_7_26;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{


    TextView tvResult=null ;

    Button btn0 = null;
    Button btn1 = null;
    Button btn2 = null;
    Button btn3 = null;
    Button btn4 = null;
    Button btn5 = null;
    Button btn6 = null;
    Button btn7 = null;
    Button btn8 = null;
    Button btn9 = null;

    Button btnAdd = null;
    Button btnSub = null;
    Button btnMul = null;
    Button btnDiv = null;

    Button btnEqu = null;
    Button btnPoi = null;


    double num1 = 0;
    double num2 = 0;
    double result = 0;

    int op = 0;//判断操作数
    boolean isClickEqu = false;//判断是否按了=号




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        //绑定控件
        tvResult= (TextView) findViewById(R.id.tvResult);

        btn0= (Button) findViewById(R.id.zero);
        btn1= (Button) findViewById(R.id.one);
        btn2= (Button) findViewById(R.id.two);
        btn3= (Button) findViewById(R.id.three);
        btn4= (Button) findViewById(R.id.four);
        btn5= (Button) findViewById(R.id.five);
        btn6= (Button) findViewById(R.id.six);
        btn7= (Button) findViewById(R.id.seven);
        btn8= (Button) findViewById(R.id.eight);
        btn9= (Button) findViewById(R.id.nine);

        btnAdd= (Button) findViewById(R.id.addition);
        btnSub= (Button) findViewById(R.id.subtration);
        btnMul= (Button) findViewById(R.id.multiplication);
        btnDiv= (Button) findViewById(R.id.division);

        btnEqu= (Button) findViewById(R.id.equals);
        btnPoi= (Button) findViewById(R.id.point);

        //添加监听

//        btn0.setOnClickListener((View.OnClickListener) this);
//        btn1.setOnClickListener((View.OnClickListener) this);
//        btn2.setOnClickListener((View.OnClickListener) this);
//        btn3.setOnClickListener((View.OnClickListener) this);
//        btn4.setOnClickListener((View.OnClickListener) this);
//        btn5.setOnClickListener((View.OnClickListener) this);
//        btn6.setOnClickListener((View.OnClickListener) this);
//        btn7.setOnClickListener((View.OnClickListener) this);
//        btn8.setOnClickListener((View.OnClickListener) this);
//        btn9.setOnClickListener((View.OnClickListener) this);
//
//        btnAdd.setOnClickListener((View.OnClickListener) this);
//        btnSub.setOnClickListener((View.OnClickListener) this);
//        btnMul.setOnClickListener((View.OnClickListener) this);
//        btnDiv.setOnClickListener((View.OnClickListener) this);
//
//        btnEqu.setOnClickListener((View.OnClickListener) this);
//        btnPoi.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.zero:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString0 = tvResult.getText().toString();
                myString0 +="0";
                tvResult.setText(myString0);
                break;

            case R.id.one:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString1 = tvResult.getText().toString();
                myString1 +="1";
                tvResult.setText(myString1);
                break;

            case R.id.two:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString2 = tvResult.getText().toString();
                myString2 +="2";
                tvResult.setText(myString2);
                break;

            case R.id.three:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString3 = tvResult.getText().toString();
                myString3 +="3";
                tvResult.setText(myString3);
                break;

            case R.id.four:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString4 = tvResult.getText().toString();
                myString4 +="4";
                tvResult.setText(myString4);
                break;

            case R.id.five:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString5 = tvResult.getText().toString();
                myString5 +="5";
                tvResult.setText(myString5);
                break;

            case R.id.six:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString6 = tvResult.getText().toString();
                myString6 +="6";
                tvResult.setText(myString6);
                break;

            case R.id.seven:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString7 = tvResult.getText().toString();
                myString7 +="7";
                tvResult.setText(myString7);
                break;

            case R.id.eight:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString8 = tvResult.getText().toString();
                myString8 +="8";
                tvResult.setText(myString8);
                break;

            case R.id.nine:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString9 = tvResult.getText().toString();
                myString9 +="9";
                tvResult.setText(myString9);
                break;



            case R.id.addition:
                String myStringAdd = tvResult.getText().toString();
                if(myStringAdd==null){
                    return;
                }
                num1=Double.valueOf(myStringAdd);
                tvResult.setText(null);
                op=1;
                isClickEqu=false;
                break;

            case R.id.subtration:
                String myStringSub = tvResult.getText().toString();
                if(myStringSub==null){
                    return;
                }
                num1=Double.valueOf(myStringSub);
                tvResult.setText(null);
                op=2;
                isClickEqu=false;
                break;

            case R.id.multiplication:
                String myStringMul = tvResult.getText().toString();
                if(myStringMul==null){
                    return;
                }
                num1=Double.valueOf(myStringMul);
                tvResult.setText(null);
                op=3;
                isClickEqu=false;
                break;

            case R.id.division:
                String myStringDiv = tvResult.getText().toString();
                if(myStringDiv==null){
                    return;
                }
                num1=Double.valueOf(myStringDiv);
                tvResult.setText(null);
                op=4;
                isClickEqu=false;
                break;


            case R.id.point:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myStringPoi = tvResult.getText().toString();
                myStringPoi +=".";
                tvResult.setText(myStringPoi);
                break;


            case R.id.equals:
                String myStringEqu = tvResult.getText().toString();
                if(myStringEqu==null){
                    return;
                }
                num2 = Double.valueOf(myStringEqu);
                tvResult.setText(null);
                switch (op){
                    case 1:
                        result=num1+num2;
                        break;
                    case 2:
                        result=num1-num2;
                        break;
                    case 3:
                        result=num1*num2;
                        break;
                    case 4:
                        result=num1/num2;
                        break;
                    default:
                        result=0;
                        break;
                }

                String tmpResult = String.valueOf(result);
                tvResult.setText(tmpResult);
                isClickEqu=true;

                break;




            default:
                break;
        }

    }
}
