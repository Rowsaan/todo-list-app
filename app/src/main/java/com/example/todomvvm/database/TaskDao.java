package com.example.todomvvm.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("select * from task where user_id=:user_id order by priority")
    LiveData<List<TaskEntry>> loadAllTasks(int  user_id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTask(TaskEntry task);

    @Update
    void update(TaskEntry task);

    @Delete
    void deleteTask(TaskEntry task);

    @Query("DELETE FROM task")
    void deleteAllNotes();


    @Query("Select * from task where id =:taskId")
    LiveData<TaskEntry> loadTAskById(int taskId);

    @Query("Select * from user where email= :mail and password= :password")

    UserEntry getUser(String mail,String password);

    @Insert
    void insert(UserEntry user);
    @Update
    void updateU (UserEntry user);

    @Delete
    void deleteU    (UserEntry user);



}
