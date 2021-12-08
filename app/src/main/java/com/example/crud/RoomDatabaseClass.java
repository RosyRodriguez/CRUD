package com.example.crud;

import androidx.room.Database;
import androidx.room.RoomDatabase;



@Database(entities = (Persona.class),version = 2)

public abstract class RoomDatabaseClass extends RoomDatabase {
    private static volatile RoomDatabase INSTANCE;

    public abstract PersonaDao personaDao();


}
