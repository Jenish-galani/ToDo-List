package com.example.todolist.Repository;

import com.example.todolist.Model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepo extends JpaRepository<ToDoList, Integer> {

}
