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
                makeToast("This button will launch my Spotify Streamer app");
                break;
            case R.id.scoresButton:
                makeToast("This button will launch my Scores app");
                break;
            case R.id.libraryButton:
                makeToast("This button will launch my Library app");
                break;
            case R.id.buildButton:
                makeToast("This button will launch my Build it Bigger app");
                break;
            case R.id.xyzButton:
                makeToast("This button will launch my XYZ Reader app");
                break;
            case R.id.capstoneButton:
                makeToast("This button will launch my Capstone app");
                break;

        }

    }
    
    public void makeToast(String string){
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
    }


}
