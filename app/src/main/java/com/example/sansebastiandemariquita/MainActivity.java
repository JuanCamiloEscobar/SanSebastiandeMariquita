package com.example.sansebastiandemariquita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView titulo, edades, duracion, petfriend, aforo, descripcion;
    ImageView image;

    ActividadTuristica actividadTuristica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo=findViewById(R.id.tituloMain);
        edades=findViewById(R.id.edadesMain);
        duracion=findViewById(R.id.duracionMain);
        petfriend=findViewById(R.id.petfriendMain);
        aforo=findViewById(R.id.aforoMain);
        descripcion=findViewById(R.id.descripcionMain);

        actividadTuristica=(ActividadTuristica) getIntent().getSerializableExtra("actividadTuristica");

        titulo.setText(actividadTuristica.getNombreActividad());
        image.setImageResource(actividadTuristica.getFotoActividad());

    }
}