package com.nisa.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buton1,buton2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buton1 = findViewById(R.id.buton1);
        buton2 = findViewById(R.id.buton2);
        textView = findViewById(R.id.textView);


        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buton1.setBackgroundColor(Color.RED);
                textView.setText("hello");
                textView.setBackgroundColor(Color.BLACK);
                textView.setTextColor(Color.RED);
                textView.setTextSize(150);


            }
        }


        );
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sayfa2 = new Intent(getApplicationContext(),Activity2.class);
                startActivity(sayfa2);
            }
        });
    }
}