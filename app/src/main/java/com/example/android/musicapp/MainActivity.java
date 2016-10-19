package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.data;
import static android.R.id.button1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPopular = new Intent(MainActivity.this, PopularActivity.class);
                startActivity(iPopular);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSearch = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(iSearch);
            }
        });
    }

    //TODO: Plan for creation
    /*
    I would implement a "pull to refresh" to update newest song that is available in the database

    I need to establish a socket connection to connect to a webserver for new data

    I would also need to dynamically create new XML layout, so that up to 5 new songs can be displayed
    and display less in case there is less new song introduced during the week

    I would also implement a Bottom Bar navigation instead of the three top buttons

    I will also add an intent to go to Amazon Music / Google Music / other music store so user can buy the song
     */
}


