package com.taskmanager;

public class Task {

    private String name;
    private String description;
    private boolean isCompleted;


    public Task(String name, String description){
        this.name = name;
        this.description = description;
        this.isCompleted = false;
    }

    // getter
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return isCompleted;
    }
    // setter
    public void setComplete(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
    public String toString(){
        return "Task: " + name + "\nDescription: " + description + "\nStatus: " + (isCompleted ? "Completed" : "Pending");
    }
}
