package com.example.nsvr.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
                    buttonAdd, buttonSub, buttonMul, buttonDiv, buttonDot, buttonEq, buttonClear;
    EditText math_input;
    float val1, val2;
    boolean add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        math_input = (EditText) findViewById(R.id.math_input);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + "9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText(math_input.getText() + ".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(math_input==null){
                   math_input.setText("");
                } else {
                        val1 = Float.parseFloat(math_input.getText() + "");
                        add = true;
                        math_input.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(math_input==null){
                    math_input.setText("");
                } else {
                    val1 = Float.parseFloat(math_input.getText() + "");
                    subtract = true;
                    math_input.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(math_input==null){
                    math_input.setText("");
                } else {
                    val1 = Float.parseFloat(math_input.getText() + "");
                    multiply = true;
                    math_input.setText(null);
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(math_input==null){
                    math_input.setText("");
                } else {
                    val1 = Float.parseFloat(math_input.getText() + "");
                    divide = true;
                    math_input.setText(null);
                }
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             val2 = Float.parseFloat(math_input.getText() + "");
                if(add==true){
                    math_input.setText((val1 + val2) + "");
                    add = false;
                }
                if(subtract==true){
                    math_input.setText((val1 - val2) + "");
                    subtract = false;
                }
                if(multiply==true){
                    math_input.setText((val1 * val2) + "");
                }
                if(divide==true){
                    math_input.setText((val1 / val2) + "");
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_input.setText("");
            }
        });
    }
}
