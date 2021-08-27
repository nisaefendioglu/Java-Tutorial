package com.nisa.contactbookapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Detay extends Fragment {

    View view;
    ImageView profile;
    ImageButton video,call,message;
    TextView detail,block;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.detay, container, false);
        tanimla();
        return view;

    }

    void tanimla(){
        profile = view.findViewById(R.id.profile);
        video = view.findViewById(R.id.video);
        call = view.findViewById(R.id.call);
        message = view.findViewById(R.id.message);
        detail = view.findViewById(R.id.detail);
        block = view.findViewById(R.id.block);


    }
}