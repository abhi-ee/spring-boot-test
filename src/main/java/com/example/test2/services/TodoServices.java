package com.example.test2.services;

import com.example.test2.Todo;

import java.util.List;

public interface TodoServices {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
