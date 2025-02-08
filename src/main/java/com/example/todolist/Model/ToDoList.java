package com.example.todolist.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ToDoList {
    @Id
    private int listId;
    private String addTask;

    public ToDoList() {
    }

    public ToDoList(int listId, String addTask) {
        this.listId = listId;
        this.addTask = addTask;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public String getAddTask() {
        return addTask;
    }

    public void setAddTask(String addTask) {
        this.addTask = addTask;
    }
}

