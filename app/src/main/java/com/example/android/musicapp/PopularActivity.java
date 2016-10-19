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
    I would need to add the Geocoder and GPSTracker to get the user's coordinate and get the cityname from it
    Geocoder geocoder = new Geocoder(this, Locale.getDefault());
    List<Address> addresses = geocoder.getFromLocation(MyLat, MyLong, 1);
    String cityName = addresses.get(0).getAddressLine(0);

    Then the app will connect to a server using a Socket, query the server with the cityName
    The server will return with data containing list of popular music for the city

    The list will then be given to the user using ListView with adapter

    When the user click on one of the song, it will play the media using MediaPlayer API

    I will also add a pull to update like in the main activity
     */
}
