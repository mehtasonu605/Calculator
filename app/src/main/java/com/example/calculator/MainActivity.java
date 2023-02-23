package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_1,button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0;
    Button buttonDivide, buttonMultiply, buttonAdd, buttonSubtract, buttonDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = findViewById(R.id.btn0);
        button_1 = findViewById(R.id.btn1);
        button_2 = findViewById(R.id.btn2);
        button_3 = findViewById(R.id.btn3);
        button_4 = findViewById(R.id.btn4);
        button_5 = findViewById(R.id.btn5);
        button_6 = findViewById(R.id.btn6);
        button_7 = findViewById(R.id.btn7);
        button_8 = findViewById(R.id.btn8);
        button_9 = findViewById(R.id.btn9);
        buttonMultiply = findViewById(R.id.btnMultiply);
        buttonAdd = findViewById(R.id.btnAddition);
        buttonDivide = findViewById(R.id.btnDivide);
        buttonSubtract = findViewById(R.id.btnSubtract);
        buttonDecimal = findViewById(R.id.btnDecimal);
    }
}