package com.nisa.contactbookapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Kisiler extends Fragment {
    View view;
    private String [] kisiİsimleri = {"Ayşe" , "Ahmet" , "Nisa" , "Mehmet" , "Ali", "Fatma"};

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.kisiler, container, false);
        tanimlama();
        return view;




    }

    void tanimlama () {
        ListView kisilerListe = view.findViewById(R.id.kisilerListe);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1 , android.R.id.text1, kisiİsimleri);
        kisilerListe.setAdapter(adapter);

        kisilerListe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment fragment = new Detay();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

    }




}
