package com.example.crud;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonaDao {
    public void agregarPersona(Persona persona);


    @Query("SELECT * FROM persona")
    LiveData<List<Persona>> getAllPersona();

    @Insert
    void insertPersonaTea(Persona persona);

    @Update
    void updatePersonaTea(Persona persona);

    @Delete
    void deletePersonaTea(Persona persona);




}
