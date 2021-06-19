package com.example.sansebastiandemariquita;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<ActividadTuristica> listadoDeDatos;

    public AdaptadorLista(ArrayList<ActividadTuristica> listadoDeDatos) {
        this.listadoDeDatos = listadoDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaListado= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista,parent,false);
        return new viewHolder(vistaListado) ;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
    holder.actualizarDatosItem(listadoDeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listadoDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView actividadTuristica;
        ImageView imagenActividad;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            actividadTuristica=itemView.findViewById(R.id.nombreActividad);
            imagenActividad=itemView.findViewById(R.id.imagenActividad);

        }

        public void actualizarDatosItem(ActividadTuristica datos) {

            actividadTuristica.setText(datos.getNombreActividad());
            imagenActividad.setImageResource(datos.getFotoActividad());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("actividadTuristica",datos);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
