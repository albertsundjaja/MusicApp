package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.id.button2;

public class PopularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iHome = new Intent(PopularActivity.this, MainActivity.class);
                startActivity(iHome);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSearch = new Intent(PopularActivity.this, SearchActivity.class);
                startActivity(iSearch);
            }
        });
    }

    //TODO: Plan for creation
    /*
    I would need to add map API in here, to locate the user GPS coordinate and get their city

    I will also add a pull to update, and it will update according to what's popular in the city

    And like the MainActivity, I need a socket to connect to a database, and the ability to dynamically create XML layout

    I will also add an intent to go to Amazon Music / Google Music / other music store so user can buy the song
     */
}
