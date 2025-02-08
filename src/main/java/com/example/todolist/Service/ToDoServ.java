package com.example.todolist.Service;

import com.example.todolist.Model.ToDoList;
import com.example.todolist.Repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServ {
    @Autowired
    private ToDoRepo toDoRepo;

    public ToDoList save(ToDoList list) {
        return toDoRepo.save(list);
    }

    public List<ToDoList> find() {
        return toDoRepo.findAll();
    }

    public List<ToDoList> saveAllList(List<ToDoList> lists) {
        return toDoRepo.saveAll(lists);
    }

    public void deleteTask(Integer id) {
        toDoRepo.deleteById(id);
    }

    public void updateRecord(ToDoList list) {
        toDoRepo.save(list);
    }
}
