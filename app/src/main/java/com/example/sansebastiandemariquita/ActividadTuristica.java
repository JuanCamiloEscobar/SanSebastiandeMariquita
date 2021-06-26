package com.example.sansebastiandemariquita;

import java.io.Serializable;

public class ActividadTuristica implements Serializable {

    String nombreActividad, edades, duracion, petfriend, aforo, descripcion;
    String fotoActividad;

    public ActividadTuristica(String nombreActividad, String edades, String duracion, String petfriend, String aforo, String descripcion, String fotoActividad) {
        this.nombreActividad = nombreActividad;
        this.edades = edades;
        this.duracion = duracion;
        this.petfriend = petfriend;
        this.aforo = aforo;
        this.descripcion = descripcion;
        this.fotoActividad = fotoActividad;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPetfriend() {
        return petfriend;
    }

    public void setPetfriend(String petfriend) {
        this.petfriend = petfriend;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoActividad() {
        return fotoActividad;
    }

    public void setFotoActividad(String fotoActividad) {
        this.fotoActividad = fotoActividad;
    }
}
