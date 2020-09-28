package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Moyurakkhi6 extends AppCompatActivity {
    TextView tv,tvv;
    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyurakkhi6);
        tv=findViewById(R.id.tv6);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tv.setTypeface(tf);
        tvv=findViewById(R.id.tv61);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tvv.setTypeface(tf);
    }
}
