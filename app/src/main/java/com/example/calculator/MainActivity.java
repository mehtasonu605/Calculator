package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_1,button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0;
    Button buttonDivide, buttonMultiply, buttonAdd, buttonSubtract, buttonDecimal, buttonEqual;
    TextView display;
    int i = 0;
    String main_str, text1, text2;
    double value1, value2, answer;

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
        buttonEqual = findViewById(R.id.btnEqual);
        display = findViewById(R.id.textView2);



       // Adding functionality

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 1);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 2);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 3);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 4);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 5);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 6);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 7);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 8);
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 9);
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + "" + 0);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                text1 = text;
                display.setText("" + text + "+");
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                text1 = text;
                display.setText("" + text + "-");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                text1 = text;
                display.setText("" + text + "*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                text1 = text;
                display.setText("" + text + "/");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                display.setText("" + text + ".");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                main_str = text;
                cal();
                display.setText("" + answer);
            }
        });




    }

    public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);

        return string;
    }

    public void cal(){
        text1 = "";
        Calculator obj = new Calculator();

        while (main_str.charAt(i)!= '/'
                && main_str.charAt(i)!= '*'
                && main_str.charAt(i)!= '+'
                && main_str.charAt(i)!= '-'
        ){
            text1 += main_str.charAt(i);
            i++;
        }
        value1 = Double.parseDouble(text1);
        int j = i;
        int k = 0;
        i++;
        char ch[] = new char[10];
        while (i<main_str.length()){
            ch[k] += main_str.charAt(i);
            k++;
            i++;
        }

        text2 = toString(ch);

        value2 = Double.parseDouble(text2);

        switch (main_str.charAt(j)){
            case '+':
                answer = obj.AddValues(value1,value2);
                break;
            case '-':
                answer = obj.SubtractValues(value1,value2);
                break;
            case '*':
                answer = obj.MultiplyValues(value1,value2);
                break;
            case '/':
                answer = obj.DivideValues(value1,value2);
                break;
            default:
                display.setText("Error");
        }
    }
}