package com.nisa.contactbookapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button sonCagrilar,kisiler,arama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        islemler();
    }

    void tanimla(){
        sonCagrilar = findViewById(R.id.sonCagrilar);
        kisiler = findViewById(R.id.kisiler);
        arama = findViewById(R.id.arama);


    }

    void islemler(){
        kisiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getApplicationContext(), Kisiler.class
                Intent intent = new Intent(MainActivity.this,Kisiler.class);
                startActivity(intent);
            }
        });

    }
}