package com.jpa.todolist.dto;

import com.jpa.todolist.entity.Todo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoResponse { // 목록 불러오기

    private String id;
    private String todos;

    // JPA 는 DTO를 List 반환하기 때문에
    // Table 그대로 뺴면안되서 없기때문에 생성자에 todo(entity) 를 매개변수로 받기
    public TodoResponse(Todo todo) {
        this.id = String.valueOf(todo.getId());
        this.todos = todo.getTodos();
    }

}
