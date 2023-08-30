package com.lobster.calculator;

import android.widget.TextView;

public class Controller {
    public static void addInteger(Integer integer, TextView view){
        String countString = view.getText().toString();
        countString += integer.toString();
        view.setText(countString);
    }
    public static void addDot(TextView view){
        String countString = view.getText().toString();
        countString += ".";
        view.setText(countString);
    }
    public static void removeLast(TextView view)
    {
        String string = view.getText().toString();
        StringBuilder sb = new StringBuilder(string);
        sb.deleteCharAt(string.length() - 1);
        string = sb.toString();
        view.setText(string);
    }
    public static void removeAll(TextView view)
    {
        String string = view.getText().toString();
        StringBuilder sb = new StringBuilder(string);
        sb.delete(0,string.length() - 1);
        sb.deleteCharAt(0);
        string = sb.toString();
        view.setText(string);
    }
    public static void addition(TextView view, boolean bool, double value1){
        value1 = Double.parseDouble(view.getText() + "");
        bool = true;
        removeAll(view);
    }

    public static void calculateAddition(TextView view, double value1, boolean bool){
        double value2 = Double.parseDouble(view.getText() + "");
        String string = value1 + value2 + "";
        view.setText(string);
        bool = false;
        value1 = 0;
        value2 = 0;
    }
}
