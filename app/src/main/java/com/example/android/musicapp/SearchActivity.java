package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iHome = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(iHome);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPopular = new Intent(SearchActivity.this, PopularActivity.class);
                startActivity(iPopular);
            }
        });
    }

    //TODO: Plan for creation
    /*
    I will send the user input to a server via Socket connection, then the server will process and find the song
    the server will then send data back with high probability of matching songs
    the songs will then be displayed using ListView with adapter
     */
}
