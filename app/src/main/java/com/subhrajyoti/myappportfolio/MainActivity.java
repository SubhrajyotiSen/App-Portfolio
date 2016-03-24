package com.subhrajyoti.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotifyButton;
    Button scoresButton;
    Button libraryButton;
    Button buildButton;
    Button xyzButton;
    Button capstoneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyButton = (Button) findViewById(R.id.spotifyButton);
        scoresButton = (Button) findViewById(R.id.scoresButton);
        libraryButton = (Button) findViewById(R.id.libraryButton);
        buildButton = (Button) findViewById(R.id.buildButton);
        xyzButton = (Button) findViewById(R.id.xyzButton);
        capstoneButton = (Button) findViewById(R.id.capstoneButton);

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer app",Toast.LENGTH_SHORT).show();

            }
        });
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Scores app",Toast.LENGTH_SHORT).show();

            }
        });
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Library app",Toast.LENGTH_SHORT).show();

            }
        });
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Build it Bigger app",Toast.LENGTH_SHORT).show();

            }
        });
        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my XYZ Reader app",Toast.LENGTH_SHORT).show();

            }
        });
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone app",Toast.LENGTH_SHORT).show();

            }
        });



    }


}
