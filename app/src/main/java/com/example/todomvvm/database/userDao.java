package com.example.todomvvm.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface userDao {

    @Query("Select * from user where email= :mail and password= :password")

    UserEntry getUser(String mail,String password);

    @Insert
    void insert(UserEntry user);
    @Update
    void updateU (UserEntry user);

    @Delete
    void deleteU (UserEntry user);

}
