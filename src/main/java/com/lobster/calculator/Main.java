package com.lobster.calculator;

import static com.lobster.calculator.Controller.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class Main extends AppCompatActivity{

    double value1;
    double value2;
    boolean addition,substraction,multiplication,division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);


        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(view -> {
            addInteger(0,textView);

        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            addInteger(1,textView);

        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            addInteger(2,textView);

        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            addInteger(3,textView);

        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            addInteger(4,textView);

        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            addInteger(5,textView);

        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view -> {
            addInteger(6,textView);

        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            addInteger(7,textView);

        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> {
            addInteger(8,textView);

        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
            addInteger(9,textView);

        });
        Button buttonDot = findViewById(R.id.button_dot);
        buttonDot.setOnClickListener(view -> {
            addDot(textView);
        });
        Button buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(view -> {
            removeAll(textView);
        });
        Button buttonPlus = findViewById(R.id.button_plus);

        buttonPlus.setOnClickListener(view -> {

                value1 = Double.parseDouble(textView.getText() + "");
                addition = true;
                removeAll(textView);

        });

        Button buttonMinus = findViewById(R.id.button_minus);
        buttonMinus.setOnClickListener(view -> {

                value1 = Double.parseDouble(textView.getText() + "");
                substraction = true;
                removeAll(textView);

        });
        Button buttonMultiply = findViewById(R.id.button_multiply);
        buttonMultiply.setOnClickListener(view -> {

                value1 = Double.parseDouble(textView.getText() + "");
                multiplication = true;
                removeAll(textView);

        });
        Button buttonDivide = findViewById(R.id.button_divide);
        buttonDivide.setOnClickListener(view -> {

                value1 = Double.parseDouble(textView.getText() + "");
                division = true;
                removeAll(textView);

        });
        Button buttonSin = findViewById(R.id.button_sin);
        buttonSin.setOnClickListener(view ->{
            textView.setText(Math.sin(Double.parseDouble(textView.getText() + "")) + "");
        });
        Button buttonCos = findViewById(R.id.button_cos);
        buttonCos.setOnClickListener(view ->{
            textView.setText(Math.cos(Double.parseDouble(textView.getText() + "")) + "");
        });

        Button buttonEquals= findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(view -> {
            if(addition){
                double value2 = Double.parseDouble(textView.getText() + "");
                String string = value1 + value2 + "";
                textView.setText(string);
                addition = false;
                value1 = 0;
            }
            if(substraction){
                double value2 = Double.parseDouble(textView.getText() + "");
                String string = value1 - value2 + "";
                textView.setText(string);
                substraction = false;
                value1 = 0;
            }
            if(multiplication){
                double value2 = Double.parseDouble(textView.getText() + "");
                String string = value1 * value2 + "";
                textView.setText(string);
                multiplication = false;
                value1 = 0;
            }
            if(division){
                double value2 = Double.parseDouble(textView.getText() + "");
                String string = value1 / value2 + "";
                textView.setText(string);
                division = false;
                value1 = 0;
            }
        });

    }


}
