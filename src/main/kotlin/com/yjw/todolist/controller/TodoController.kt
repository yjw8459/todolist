package com.yjw.todolist.controller

import com.yjw.todolist.service.TodoService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/todo")
class TodoController(
    private val todoService: TodoService
) {

    /**
     * 조회
     */
    @GetMapping
    fun getTodos() = todoService.getTodos()

    /**
     * 추가
     */
    @PostMapping
    fun insertTodo(@RequestBody todoRequest: TodoRequest) = todoService.insertTodo(todoRequest.todoName)

    /**
     * 수정
     * Kotlin에선 path를 사용한다.
     */
    @PutMapping(path = ["/{todoId}"])
    fun updateTodo(@PathVariable("todoId") todoId: Long) = todoService.updateTodo(todoId)

    /**
     * 삭제
     */
    @DeleteMapping(path = ["/{todoId}"])
    fun deleteTodo(@PathVariable("todoId") todoId: Long) = todoService.deleteTodo(todoId)


}