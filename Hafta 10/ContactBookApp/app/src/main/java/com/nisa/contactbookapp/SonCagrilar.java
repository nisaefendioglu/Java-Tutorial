package com.nisa.contactbookapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SonCagrilar extends Activity {

    private String [] kisiİsimleri = {"Ayşe" , "Ahmet" , "Nisa" , "Mehmet" , "Ali", "Fatma"};


    TextView sonAramalar;
    ListView sonAramaListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soncagrilar);
        tanimlama();
        islemler();
    }

    void tanimlama(){
        sonAramalar = findViewById(R.id.sonAramalar);
        sonAramaListView = findViewById(R.id.sonAramaListView);

    }

    void islemler(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, kisiİsimleri);
        sonAramaListView.setAdapter(adapter);
    }
}
