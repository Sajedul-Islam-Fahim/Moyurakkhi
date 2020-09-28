package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Moyurakkhi2 extends AppCompatActivity {
    TextView tv,tvv,tvvv;
    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyurakkhi2);
        tv=findViewById(R.id.tv2);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tv.setTypeface(tf);
        tvv=findViewById(R.id.tv22);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tvv.setTypeface(tf);
        tvvv=findViewById(R.id.tv221);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tvvv.setTypeface(tf);
    }
}
