package com.example.todomvvm.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task")
public class TaskEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private int priority;
    @ColumnInfo(name="updated_at")
    private Date updatedAt;
    private int user_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        user_id = user_id;
    }

    @Ignore
    public TaskEntry(String description, int priority, Date updatedAt,int user_id) {
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.user_id = user_id;
    }

    public TaskEntry(int id, String description, int priority, Date updatedAt, int user_id) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.user_id= user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
