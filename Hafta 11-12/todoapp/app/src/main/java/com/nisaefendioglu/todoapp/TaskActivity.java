package com.nisaefendioglu.todoapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TaskActivity {

    private String id;
    private int data;
    private String description;
    private Date update;

    TaskActivity(String id, int data, String description, Date update){
        this.id = id;
        this.data = data;
        this.description = description;
        this.update = update;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPriority() {
        return data;
    }

    public void setPriority(int priority) {
        this.data = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdatedAt() {
        return update;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.update = update;
    }


 public String toString(){
     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.getDefault());
     return id + "\t" + description + "\t" + data + "\t" + dateFormat.format(update);

 }
}