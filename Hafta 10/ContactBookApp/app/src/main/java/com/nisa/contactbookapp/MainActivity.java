package com.nisa.contactbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sonCagrilar,kisiler,arama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    void tanimla(){
        sonCagrilar = findViewById(R.id.sonCagrilar);
        kisiler = findViewById(R.id.kisiler);
        arama = findViewById(R.id.arama);
    }
}