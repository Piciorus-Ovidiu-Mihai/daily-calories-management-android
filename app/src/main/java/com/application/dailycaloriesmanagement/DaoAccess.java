package com.application.dailycaloriesmanagement;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.application.dailycaloriesmanagement.ui.daycalories.Note;

import java.util.List;

@Dao
public interface DaoAccess {

    @Insert
    Long insertTask(Note note);

    @Query("SELECT * FROM Note ORDER BY title desc")
    LiveData<List<Note>> fetchAllTasks();


    @Query("SELECT * FROM Note WHERE id =:taskId")
    LiveData<Note> getTask(int taskId);


    @Update
    void updateTask(Note note);


    @Delete
    void deleteTask(Note note);
}
