package com.example.todomvvm.database;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Relation;

import java.util.List;

@Entity
public class Relation_table {

    @Embedded public UserEntry user;
    @Relation(
            parentColumn = "id",
            entityColumn = "user_id",
            entity = TaskEntry.class



    )
    public List<TaskEntry> taskEntry;

    public Relation_table(UserEntry user, List<TaskEntry> taskEntry) {
        this.user = user;
        this.taskEntry = taskEntry;
    }

    public UserEntry getUser() {
        return user;
    }

    public void setUser(UserEntry user) {
        this.user = user;
    }

    public List<TaskEntry>  getTaskEntry() {
        return taskEntry;
    }

    public void setTaskEntry(List<TaskEntry> taskEntry) {
        this.taskEntry = taskEntry;
    }
}