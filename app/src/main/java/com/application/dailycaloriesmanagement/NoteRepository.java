package com.application.dailycaloriesmanagement;

import android.app.Application;
import android.content.Context;
import android.database.DatabaseUtils;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import com.application.dailycaloriesmanagement.ui.daycalories.Note;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class NoteRepository {

    private String DB_NAME = "db_task";

    Date currentTime = Calendar.getInstance().getTime();
    private NoteDataBase noteDataBase;
    public NoteRepository(Context context){
        noteDataBase = Room.databaseBuilder(context,NoteDataBase.class,DB_NAME).build();
    }
    public void insertTask(String title,
                           String description) {

        insertTask(title, description, false, null);
    }

    public void insertTask(String title,
                           String description,
                           boolean encrypt,
                           String password) {

        Note note = new Note();
        note.setTitle(title);
        note.setDescription(description);

        insertTask(note);
    }

    public void insertTask(final Note note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                noteDataBase.daoAccess().insertTask(note);
                return null;
            }
        }.execute();
    }


    public void deleteTask(final int id) {
        final LiveData<Note> task = getTask(id);
        if(task != null) {
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... voids) {
                    noteDataBase.daoAccess().deleteTask(task.getValue());
                    return null;
                }
            }.execute();
        }
    }

    public void deleteTask(final Note note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                noteDataBase.daoAccess().deleteTask(note);
                return null;
            }
        }.execute();
    }

    public LiveData<Note> getTask(int id) {
        return noteDataBase.daoAccess().getTask(id);
    }

    public LiveData<List<Note>> getTasks() {
        return noteDataBase.daoAccess().fetchAllTasks();
    }
}
