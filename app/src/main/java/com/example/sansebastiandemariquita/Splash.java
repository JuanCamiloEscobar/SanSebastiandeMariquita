package com.example.sansebastiandemariquita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer sonidoCascada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sonidoCascada= MediaPlayer.create(this,R.raw.cascada);
        sonidoCascada.start();

        TimerTask inicio = new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(Splash.this,Home.class);
                startActivity(intent);
                sonidoCascada.stop();
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicio,2000);
    }
}