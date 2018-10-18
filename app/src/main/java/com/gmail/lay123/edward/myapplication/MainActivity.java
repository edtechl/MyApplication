package com.gmail.lay123.edward.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("lalalalalalalalalalallalalalalalalalaa");
        textView.setTextColor(Color.RED);
        textView.setTextSize(60);
        textView.setMaxLines(2);

        setContentView(textView);
    }
}
