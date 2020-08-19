package com.example.rscalculaotr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    Button btnClear,btnBack,btnPercentage,btnDivide
            ,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0
            ,btnMultiply,btnAdd,btnMinus,btnEqual,btnDot,btnExit;
    TextView txtCurrent,txtResult;

    String a = "";
    String b="" ;
    int LeftValue;
    int RightValue;
    int result;
    Boolean decider = false;
    int q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtCurrent = findViewById(R.id.txtCurrent);
        txtResult = findViewById(R.id.txtResult);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnClear = findViewById(R.id.btnClear);
        btnBack = findViewById(R.id.btnBack);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnEqual = findViewById(R.id.btnEqual);
        btnExit = findViewById(R.id.btnExit);
        btnDot = findViewById(R.id.btnDot);




    }


    public void btnClick(View v){
        switch(v.getId()){
            case R.id.btn0:
                op(btn0);
                break;
            case R.id.btn1:
                op(btn1);
                break;
            case R.id.btn2:
                op(btn2);
                break;
            case R.id.btn3:
                op(btn3);
                break;
            case R.id.btn4:
                op(btn4);
                break;
            case R.id.btn5:
                op(btn5);
                break;
            case R.id.btn6:
                op(btn6);
                break;
            case R.id.btn7:
                op(btn7);
                break;
            case R.id.btn8:
                op(btn8);
                break;
            case R.id.btn9:
                op(btn9);
                break;
            case R.id.btnDot:
                Toast.makeText(this, "Sorry Guys , am too Lazy to Implement Dot, " +
                        "Hence divsion will not show exact Value", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnExit:
                finish();
                break;
            case R.id.btnBack:
                Toast.makeText(this, "Not Working! Under Maintenance", Toast.LENGTH_SHORT).show();
                break;


            case R.id.btnClear:
                a ="";
                txtCurrent.setText(a);
                b="";
                txtResult.setText(0+"");
                LeftValue = 0;
                RightValue = 0;
                result=0;
                decider=false;
                q=0;
                break;

            case R.id.btnEqual:
                if(LeftValue!=0 && RightValue!=0){
                    if(q!=0){
                        if(q==1){
                            result = RightValue+LeftValue;
                            txtResult.setText( result +"");
                            LeftValue = result;
                            RightValue = 0;
                            b="";
                            a=result+"";
                            q=0;

                        }else if(q == 2){
                            result = LeftValue-RightValue;
                            txtResult.setText( result +"");
                            LeftValue = result;
                            RightValue = 0;
                            b="";
                            a=result+"";
                            q=0;
                        }else if(q == 3){
                            result = LeftValue/RightValue;
                            txtResult.setText( result +"");
                            LeftValue = result;
                            RightValue = 0;
                            b="";
                            a=result+"";
                            q=0;
                        }else if(q == 4){
                            result = LeftValue*RightValue;
                            txtResult.setText( result +"");
                            LeftValue = result;
                            RightValue = 0;
                            b="";
                            a=result+"";
                            q=0;
                        }else if(q == 5){
                            result = (LeftValue*RightValue)/100;
                            txtResult.setText( result +"");
                            LeftValue = result;
                            RightValue = 0;
                            b="";
                            a=result+"";
                        }
                    }
                }

                break;

            case R.id.btnDivide:
                res("/");
                break;
            case R.id.btnAdd:
                res("+");
                break;
            case R.id.btnMultiply:
                res("x");
                break;
            case R.id.btnMinus:
                res("-");
                break;
            case R.id.btnPercentage:
                res("%");
                break;

        }
    }

    public void op(Button btn){
        if(decider){
            b = b+ btn.getText().toString();
            RightValue = Integer.parseInt(b);
        }
        a =a+ btn.getText().toString();
        txtCurrent.setText(a);
    }

    public void res(String s){
        try{
            if(LeftValue ==0 ){
                LeftValue = Integer.parseInt(a);
            }

            if(q!=0){
                if(q==1){
                    result = RightValue+LeftValue;
                    txtResult.setText( result +"");
                    LeftValue = result;
                    RightValue = 0;
                    b="";
                    a=result+"";

                }else if(q == 2){
                    result = LeftValue-RightValue;
                    txtResult.setText( result +"");
                    LeftValue = result;
                    RightValue = 0;
                    b="";
                    a=result+"";
                }else if(q == 3){
                    result = LeftValue/RightValue;
                    txtResult.setText( result +"");
                    LeftValue = result;
                    RightValue = 0;
                    b="";
                    a=result+"";
                }else if(q == 4){
                    result = LeftValue*RightValue;
                    txtResult.setText( result +"");
                    LeftValue = result;
                    RightValue = 0;
                    b="";
                    a=result+"";
                }else if(q == 5){
                    result = (LeftValue*RightValue)/100;
                    txtResult.setText( result +"");
                    LeftValue = result;
                    RightValue = 0;
                    b="";
                    a=result+"";
                }
            }

            if(s.equals("+")){
                q=1;
            }
            if(s.equals("-")){
                q=2;
            }
            if(s.equals("/")){
                q=3;
            }
            if(s.equals("x")){
                q=4;
            }
            if(s.equals("%")){
                q=5;
            }

            decider = true;

            a =a+s;
            txtCurrent.setText(a);
        }catch (Exception e){

        }

    }
}