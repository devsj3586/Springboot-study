package com.jpa.todolist.controller;

import com.jpa.todolist.dto.TodoResponse;
import com.jpa.todolist.service.TodoService;
import com.jpa.todolist.service.impl.TodoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    // Service 연결
    private final TodoService todoService;
    // GET 맵핑 (/todos
    @GetMapping("/todos")
    public List<TodoResponse> todoList () {
        return todoService.todoList();
    }

    // Delete (/todos/{id})
    @DeleteMapping("/todos/{id}")
    public String deleteTodos (@PathVariable("id")String id) {
        return todoService.deleteTodos(id);
    }

    // POST ("/todos)
    @PostMapping("/todos")
    public String insertTodos (String todos) {
        return todoService.insertTodos(todos);
    }

}
