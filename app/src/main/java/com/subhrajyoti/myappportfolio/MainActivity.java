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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void clicked(View view){
        switch (view.getId()){
            case R.id.spotifyButton:
                Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.scoresButton:
                Toast.makeText(getApplicationContext(),"This button will launch my Scores app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.libraryButton:
                Toast.makeText(getApplicationContext(),"This button will launch my Library app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildButton:
                Toast.makeText(getApplicationContext(),"This button will launch my Build it Bigger app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyzButton:
                Toast.makeText(getApplicationContext(),"This button will launch my XYZ Reader app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstoneButton:
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone app",Toast.LENGTH_SHORT).show();
                break;

        }

    }


}
