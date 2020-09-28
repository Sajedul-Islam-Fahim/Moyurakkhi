package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Moyurakkhi extends AppCompatActivity {
    TextView tv,tvv;
    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyurakkhi);
        tv=findViewById(R.id.tv1);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tv.setTypeface(tf);
        tvv=findViewById(R.id.tv11);
        tf= Typeface.createFromAsset(getAssets(),"font/Nikosh.ttf");
        tvv.setTypeface(tf);
    }
}
