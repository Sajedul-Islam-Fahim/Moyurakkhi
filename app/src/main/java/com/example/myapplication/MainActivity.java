package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        btn4=findViewById(R.id.b4);
        btn5=findViewById(R.id.b5);
        btn6=findViewById(R.id.b6);
        btn7=findViewById(R.id.b7);
        btn8=findViewById(R.id.b8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first=new Intent(MainActivity.this,Moyurakkhi.class);
                startActivity(first);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scnd=new Intent(MainActivity.this,Moyurakkhi2.class);
                startActivity(scnd);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third=new Intent(MainActivity.this,Moyurakkhi3.class);
                startActivity(third);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frth=new Intent(MainActivity.this,Moyurakkhi4.class);
                startActivity(frth);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifth=new Intent(MainActivity.this,Moyurakkhi5.class);
                startActivity(fifth);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent six=new Intent(MainActivity.this,Moyurakkhi6.class);
                startActivity(six);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seven=new Intent(MainActivity.this,Moyurakkhi7.class);
                startActivity(seven);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eight=new Intent(MainActivity.this,Moyurakkhi8.class);
                startActivity(eight);
            }
        });
    }

}
