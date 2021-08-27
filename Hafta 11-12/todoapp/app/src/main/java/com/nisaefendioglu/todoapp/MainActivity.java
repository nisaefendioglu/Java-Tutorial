package com.nisaefendioglu.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fabAdded;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabAdded = findViewById(R.id.fabAdded);
        fabAdded.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,ListActivty.class);
            startActivity(intent);
        });





    }
}