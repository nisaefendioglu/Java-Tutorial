package com.nisa.contactbookapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Kisiler extends Activity {


    private String [] kisiİsimleri = {"Ayşe" , "Ahmet" , "Nisa" , "Mehmet" , "Ali", "Fatma"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kisiler);

        ListView kisilerListe = findViewById(R.id.kisilerListe);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , android.R.id.text1, kisiİsimleri);

        kisilerListe.setAdapter(adapter);



    }
}
