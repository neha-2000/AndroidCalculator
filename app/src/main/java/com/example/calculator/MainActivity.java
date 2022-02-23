package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnMin,btnMul,btnDiv,btnEql,btnC,btnD,btn0;
    EditText ed1;
    float Result1,Result2;
    boolean Add,Sub,Mul,Div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnMin=(Button)findViewById(R.id.btnMin);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnEql=(Button)findViewById(R.id.btnEql);
        btnC=(Button)findViewById(R.id.btnC);
        btnD=(Button)findViewById(R.id.btnD);
        btn0=(Button)findViewById(R.id.btn0);
        ed1=(EditText)findViewById(R.id.editText);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Result1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);
                }
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Result1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Result1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Result1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result2=Float.parseFloat(ed1.getText()+"");
                if (Add==true) {
                    ed1.setText(Result1+Result2+"");
                    Add=false;
                }
                if (Sub==true) {
                    ed1.setText(Result1-Result2+"");
                    Sub=false;
                }
                if (Mul==true) {
                    ed1.setText(Result1*Result2+"");
                    Mul=false;
                }
                if (Div==true) {
                    ed1.setText(Result1/Result2+"");
                    Div=false;
                }

            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");

            }
        });
    }



}
