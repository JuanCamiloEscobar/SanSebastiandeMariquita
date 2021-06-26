package com.example.sansebastiandemariquita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    FirebaseFirestore baseDatos = FirebaseFirestore.getInstance();

    ArrayList<ActividadTuristica> listaDatos= new ArrayList<>();
    RecyclerView listado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado=findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();
    }

    private void crearListado() {

        baseDatos.collection("actividad")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {

                        if(task.isSuccessful()){

                            for(QueryDocumentSnapshot document: task.getResult()){

                                String nombre=document.get("nombre").toString();
                                String edades=document.get("edades").toString();
                                String duracion=document.get("duracion").toString();
                                String petfriendly=document.get("petfriendly").toString();
                                String aforo=document.get("aforo").toString();
                                String descripcion=document.get("descripcion").toString();
                                String foto=document.get("foto").toString();

                                listaDatos.add(new ActividadTuristica(nombre,edades,duracion,petfriendly,aforo,descripcion,foto));

                            }
                            AdaptadorLista adapatador= new AdaptadorLista(listaDatos);
                            listado.setAdapter(adapatador);

                        }else{

                            Toast.makeText(getApplicationContext(),"Error consultando datos",Toast.LENGTH_LONG).show();

                        }

                    }
                });



    }

    public boolean OnCreateOptionMenu(Menu menu){
      getMenuInflater().inflate(R.menu.menu, menu);
      return true;
    }

    public boolean onOptionsItemSelected(MenuItem items){
        int id=items.getItemId();

        switch(id){

            case(R.id.opcion1):

                break;

            case(R.id.opcion2):

                break;
        }

        return super.onOptionsItemSelected(items);
    }

}

