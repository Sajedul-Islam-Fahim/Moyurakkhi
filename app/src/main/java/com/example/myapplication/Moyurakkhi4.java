package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Moyurakkhi4 extends AppCompatActivity {
    TextView tv;
    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyurakkhi4);
        tv=findViewById(R.id.tv4);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tv.setTypeface(tf);
    }
}
