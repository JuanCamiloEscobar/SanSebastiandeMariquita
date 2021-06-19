package com.example.sansebastiandemariquita;

import java.io.Serializable;

public class ActividadTuristica implements Serializable {

    String nombreActividad, edades, duracion, petfriend, aforo, descripcion;
    int fotoActividad;

    public ActividadTuristica(String nombreActividad,String edades, int fotoActividad) {
        this.nombreActividad = nombreActividad;
        this.fotoActividad = fotoActividad;
        this.edades = edades;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getEdades() {
        return edades;
    }

    public void setEdades(String edades) {
        this.edades = edades;
    }

    public int getFotoActividad() {
        return fotoActividad;
    }

    public void setFotoActividad(int fotoActividad) {
        this.fotoActividad = fotoActividad;
    }


}
