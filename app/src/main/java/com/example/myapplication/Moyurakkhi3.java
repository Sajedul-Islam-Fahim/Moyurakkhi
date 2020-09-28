package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Moyurakkhi3 extends AppCompatActivity {
    TextView tv,tvv;
    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyurakkhi3);
        tv=findViewById(R.id.tv3);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tv.setTypeface(tf);
        tvv=findViewById(R.id.tv31);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tvv.setTypeface(tf);
    }
}
