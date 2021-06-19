package com.example.sansebastiandemariquita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<ActividadTuristica> listaDatos= new ArrayList<>();
    RecyclerView listado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado=findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();

        AdaptadorLista adaptador = new AdaptadorLista(listaDatos);
        listado.setAdapter(adaptador);
    }

    private void crearListado() {
        listaDatos.add(new ActividadTuristica("ECOTURISMO","18-60 Años",R.drawable.ecoturismo));
        listaDatos.add(new ActividadTuristica("TOUR DE FRUTAS","Todas las edades",R.drawable.frutas));
        listaDatos.add(new ActividadTuristica("NACIMIENTOS DE AGUA","18-50 Años",R.drawable.cascada));
        listaDatos.add(new ActividadTuristica("TURISMO RELIGIOSO","Todas las edades",R.drawable.iglesia));


    }
}