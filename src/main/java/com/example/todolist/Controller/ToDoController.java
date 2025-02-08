package com.example.todolist.Controller;

import com.example.todolist.Model.ToDoList;
import com.example.todolist.Service.ToDoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ToDo-List")
public class ToDoController {
    @Autowired
    private ToDoServ toDoServ;

    @PostMapping("/Add-Task")
    public String save(@RequestBody ToDoList list) {
        toDoServ.save(list);
        return "Task added successfully";
    }

    @GetMapping("/Show-Tasks")
    public List<ToDoList> lists() {
        return toDoServ.find();
    }

    @PostMapping("/Add-Tasks")
    public String saveAll(@RequestBody List<ToDoList> lists) {
        toDoServ.saveAllList(lists);
        return "Tasks Added successfully";
    }

    @DeleteMapping("/DeleteTaskById/{id}")
    public String deleteList(@PathVariable Integer id) {
        toDoServ.deleteTask(id);
        return "Task complete successfully";
    }

    @PutMapping("/updateTaskById/{id}")
    public String updateList(@RequestBody ToDoList list) {
        toDoServ.save(list);
        return "Task updated successfully";
    }
}
