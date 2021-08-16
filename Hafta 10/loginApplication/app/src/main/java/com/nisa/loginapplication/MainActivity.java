package com.nisa.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textview2;
    EditText isim;
    RadioButton radioButton1,radioButton2;
    Button kayitOl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimlama();

    }

    void tanimlama(){
        textView = findViewById(R.id.textview);
        textview2 = findViewById(R.id.textview2);
        isim = findViewById(R.id.isim);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        kayitOl = findViewById(R.id.kayitOl);

        kayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("Kayıt Başarılı");


            }
        });
    }

}