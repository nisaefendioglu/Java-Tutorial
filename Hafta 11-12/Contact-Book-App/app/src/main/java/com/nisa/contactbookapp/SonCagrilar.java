package com.nisa.contactbookapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class SonCagrilar extends Fragment {

    View view;
    private String [] kisiİsimleri = {"+90(5524851389)" , "212 568 2714" , "Nisa" , "Mehmet" , "444 1 500", "Fatma"};


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.soncagrilar, container, false);
        tanimlama();
        return view;


    }

    void tanimlama () {
        ListView kisilerListe = view.findViewById(R.id.sonAramaListView);
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
