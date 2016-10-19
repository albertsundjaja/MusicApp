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
    The app will connect to a server using Socket, the server will reply with data containing list of new songs released

    The data will then be given to the user using ListView with adapter

    Users will be able to click the song, and playback using MediaPlayer API

    I would implement a "pull to refresh" to update newest song that is available in the database using SwipeRefreshLayout

    I would also implement the toolbar using TabLayout navigation instead of the three top buttons
     */
}


