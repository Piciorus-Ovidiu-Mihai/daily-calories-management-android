package com.application.dailycaloriesmanagement;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.application.dailycaloriesmanagement.ui.daycalories.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NoteDataBase extends RoomDatabase {
    public abstract DaoAccess daoAccess();
}
