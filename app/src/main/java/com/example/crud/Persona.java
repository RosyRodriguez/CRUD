package com.example.crud;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Persona {

    @PrimaryKey(autoGenerate = true)
    private  int id;

    @ColumnInfo(name="personaNombre")
    @NonNull
    private String nombre;

    @ColumnInfo(name="personaEdad")
    @NonNull
    private int edad;

    @ColumnInfo(name="personaTelefono")
    @NonNull
    private int telefono;

    public Persona() {
    }

    public Persona(int id, @NonNull String nombre, int edad, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
