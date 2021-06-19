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
        listaDatos.add(new ActividadTuristica(
                "ECOTURISMO",
                "18-60 Años",
                "3H",
                "PetFriendly",
                "Max 10 pax",
                "San Sebastián de Mariquita es un municipio colombiano ubicado en el norte del departamento de Tolima. Está a una altitud de 495 M.s.n.m. con una temperatura promedio de 26°C, Tenía una población de 33.329 habitantes para el 2016.3",
                R.drawable.ecoturismo));

        listaDatos.add(new ActividadTuristica(
                "TOUR DE FRUTAS",
                "Todas las edades",
                "2H",
                "No PetFriendly",
                "Max 12 pax",
                "Con motivo de celebrar cada año la fecha de fundación del municipio, el 28 de agosto, se desarrolla anualmente una serie de importantes eventos musicales y culturales en San Sebastián de Mariquita, entre los que se destacan el Festival Nacional de Música Mangostino de Oro, al cual concurren prestigiosos músicos, en la modalidad de duetos, tríos y solistas de tiple, reconocidos a nivel nacional.",
                R.drawable.frutas));

        listaDatos.add(new ActividadTuristica(
                "NACIMIENTOS DE AGUA",
                "18-50 Años",
                "4H",
                "PetFriendly",
                "Max 15 pax",
                "También cuenta con un espacio que potencia la cultura y el arte desde las dinámicas musicales emergentes en el Municipio, nace desde el segundo semestre de 2002 el Festival Marakas Rock, el cual se ha venido gestando como el vehículo más importante del centro Colombiano para la presentación en vivo de artistas del Municipio de Mariquita, del Departamento del Tolima y de la Nación ante el público joven de la región, y como espacio de convivencia, tolerancia y cultura, cuyo eje central es la música como generadora de diferentes manifestaciones culturales de la juventud y la buena utilización del tiempo libre, bajo el lema “Que tu único vicio sea la música”.",
                R.drawable.cascada));

        listaDatos.add(new ActividadTuristica(
                "TURISMO RELIGIOSO",
                "Todas las edades",
                "1H",
                "Not PetFriendly",
                "Max 20 pax",
                "San Sebastián de Mariquita es un municipio que cuenta con varios sitios de interés histórico y turístico, en donde se puede apreciar la arquitectura colonial de la zona: La Ermita, la iglesia de San Sebastián, la Casa de la Moneda,El parque principal, la Casa Mutis, las ruinas de Santa Lucía, la pila de los ingleses, la casa de los virreyes, la casa de los jesuitas, la mansión de Jiménez de Quesada, y la finca campestre Peniel que ha recogido la historia del municipio y la comparte día a día con nativos de la región, turistas y visitantes.",
                R.drawable.iglesia));

    }
}