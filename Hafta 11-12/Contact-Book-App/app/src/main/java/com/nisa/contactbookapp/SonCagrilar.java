package com.nisa.contactbookapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

public class SonCagrilar extends Fragment {

    View view;
    private String [] kisiİsimleri = {"021251548" , "2568228" , "Nisa" , "Mehmet" , "Ali", "Fatma"};

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.soncagrilar,container,false);
        tanimlama();
        return view;
    }


    void tanimlama(){
        ListView kisilerListe = view.findViewById(R.id.sonAramaListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, kisiİsimleri);
        kisilerListe.setAdapter(adapter);



    }


}
